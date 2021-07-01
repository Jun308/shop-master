/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.service.CategoryService;
import client.service.ProductService;
import entity.Category;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DummyDAO;

/**
 *
 * @author Derick-T
 */
@WebServlet(name = "Filter", urlPatterns = {"/filter"})
public class Filter extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            //
            int PageSize = 12;
            DummyDAO dm = new DummyDAO();
            String PageIndex_raw = request.getParameter("page");
            PageIndex_raw = (PageIndex_raw == null) ? "1" : PageIndex_raw;
            int PageIndex = Integer.parseInt(PageIndex_raw);
            int rowcount = dm.getRowCount();
            int maxPage = rowcount / PageSize
                    + (rowcount % PageSize != 0 ? 1 : 0);
            ///
            CategoryService categoryService = new CategoryService();
            ArrayList<Category> listCategory = categoryService.getAll();
            request.setAttribute("listCategory", listCategory);
            int categoryId = 0;
            String search = request.getParameter("searchName");
            String category = request.getParameter("id");
            try {
                categoryId = Integer.valueOf(request.getParameter("id"));
            } catch (NumberFormatException e) {
                categoryId = 0;
            }
            ProductService productService = new ProductService();
            ArrayList<Product> listProduct = new ArrayList<>();
            if (categoryId != 0) {
                if (search == null) {
                    listProduct = productService.getAllProductByCategory(categoryId);
                } else {
                    listProduct = productService.getProductByIdAndName(categoryId, search);
                }
            } else {
                listProduct = dm.pagging(PageIndex, PageSize);
            }

            // đấy dữ liệu sang jsp
            request.setAttribute("listProduct", listProduct);
            //
            request.setAttribute("maxPage", maxPage);
            request.setAttribute("pageIndex", PageIndex);
            request.setAttribute("search", search);
            request.setAttribute("category", category);
            
            //
            request.getRequestDispatcher("product.jsp").forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
