/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.service.ProductService;
import entity.Cart;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Derick-T
 */
public class CartProduct extends HttpServlet {

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
            HttpSession session = request.getSession();
            ArrayList<Cart> cart = new ArrayList<>();

            boolean flag = true;
           
            int productID = Integer.parseInt(request.getParameter("id"));
            double productPrice = Double.parseDouble(request.getParameter("price"));
            int quantity = Integer.parseInt(request.getParameter("quantity"));
            ProductService productservice = new ProductService();
            Product product = productservice.getOne(productID);
            if (session.getAttribute("ListCart") != null) {
                cart = (ArrayList<Cart>) session.getAttribute("ListCart");
                cart.add(new Cart(productID, product.getName(), productPrice, quantity));          //Add the new user data over here
                // 1, Check Duplicate in list 
                for (int i = 0; i < cart.size(); i++) {
                    for (int j = i + 1; j < cart.size(); j++) {
                        if (cart.get(i).getProductID() == cart.get(j).getProductID()) {
                            cart.remove(j);
                            cart.set(i, new Cart(cart.get(i).getProductID(), cart.get(i).getName(), cart.get(i).getProductPrice(), cart.get(i).getQuantity() + 1));
                            j -= 1;
                        }
                    }
                }

//                // 2,check duplicate in list
//                for(Cart c : cart){
//                    if(c.getProductID() == productID){
//                        c.setQuantity(c.getQuantity()+1);
//                        flag = false;
//                    }
//                }
//                if(flag == true){
//                    cart.add(new Cart(productID, productPrice, quantity));
//                }
                
                session.setAttribute("ListCart", cart);   //Now set the updated list to the session object
                response.sendRedirect("filter");
            } else {
                cart.add(new Cart(productID, product.getName(), productPrice, quantity));   
                session.setAttribute("ListCart", cart);   //Now set the updated list to the session object
                response.sendRedirect("filter");
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
