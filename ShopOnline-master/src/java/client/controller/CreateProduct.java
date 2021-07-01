/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import config.IMessageConfig;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.ProductModel;

/**
 *
 * @author Derick-T
 */
@WebServlet(name = "CreateProduct", urlPatterns = {"/createProduct"})
public class CreateProduct extends HttpServlet {

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
            request.setCharacterEncoding("UTF-8");
            ProductModel pm = new ProductModel();
            String name = null;
            if (request.getParameter("name") != null) {
                name = request.getParameter("name");
            } else {
                request.setAttribute("errorMessage", IMessageConfig.Null_Valid_Product);
                request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
            }
            String category = request.getParameter("category");
            int categoryId = Integer.valueOf(category);
            int price = 0;
            try {
                price = Integer.valueOf(request.getParameter("price"));
            } catch (Exception e) {
                request.setAttribute("errorMessage", IMessageConfig.Null_Valid_Product);
                request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
            }
            int quantity = 0;

            try {
                quantity = Integer.valueOf(request.getParameter("quantity"));
            } catch (Exception e) {
                request.setAttribute("errorMessage", IMessageConfig.Null_Valid_Product);
                request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
            }

            String decription = null;
            if (request.getParameter("decription") != null) {
                decription = request.getParameter("decription");
            } else {
                request.setAttribute("errorMessage", IMessageConfig.Null_Valid_Product);
                request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
            }
            String image = null;
            if (request.getParameter("image") != null) {
                image = request.getParameter("image");
            } else {
                request.setAttribute("errorMessage", IMessageConfig.Null_Valid_Product);
                request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
            }
            String note = request.getParameter("note");
            if (note == null) {
                note = "";
            }
            try {
                Product pro = new Product(name, categoryId, price, decription, quantity, 1, image, note);
                boolean flag = pm.add(pro);
                if (flag == true) {
                    response.sendRedirect("administration.jsp");
                } else {
                    request.setAttribute("errorMessage", IMessageConfig.Error_Valid_Product);
                    request.getRequestDispatcher("CreateProduct.jsp").forward(request, response);
                }

            } catch (IOException | ServletException e) {
                System.out.println(e);
            }

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
