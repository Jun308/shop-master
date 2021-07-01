/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.service.ProductService;
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
@WebServlet(name = "UpdateProduct", urlPatterns = {"/updateProduct"})
public class UpdateProduct extends HttpServlet {

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
            int id = 0;
            if (request.getParameter("id") != null) {
                id = Integer.valueOf(request.getParameter("id"));
                String name = request.getParameter("name");
                int quantity = 0;
                if (request.getParameter("quantity") != null) {
                    quantity = Integer.valueOf(request.getParameter("quantity"));
                }
                double price = 0;
                if (request.getParameter("price") != null) {
                    price = Double.valueOf(request.getParameter("price"));
                }
                int status = 0;
                if (request.getParameter("status") != null) {
                    status = Integer.valueOf(request.getParameter("status"));
                }
                String note = request.getParameter("note");
                if (note == null) {
                    note = "";
                }
                String decription = null;
                if (request.getParameter("decription") != null) {
                    decription = request.getParameter("decription");
                }
                if (name != null && decription != null) {
                    ProductModel pm = new ProductModel();
                    Product product = new Product(id, name, price, decription, quantity, status, note);
                    boolean flag = pm.update(product);
                    if (flag == true) {
                        response.sendRedirect("filter");
                    }
                }

                request.getRequestDispatcher("updateproduct.jsp").forward(request, response);
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
