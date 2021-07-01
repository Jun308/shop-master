/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import entity.Account;
import entity.Cart;
import entity.OrderDetail;
import entity.OrderPro;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.OrderDetailModel;
import model.OrderModel;

/**
 *
 * @author Derick-T
 */
public class OderDetail extends HttpServlet {

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
            OrderModel orderModel = new OrderModel();
            OrderDetailModel orderDetailModel = new OrderDetailModel();
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime now = LocalDateTime.now();
            String date = dtf.format(now);
            double totalPrice =0;
            Account account = (Account) session.getAttribute("currentLoginAccount");
            ArrayList<Cart> Listcart = (ArrayList<Cart>) session.getAttribute("ListCart");
            ArrayList<OrderDetail> listOrder = new ArrayList<>();
            
                for (Cart c : Listcart) {
                    totalPrice += (c.getQuantity() * c.getProductPrice());
                }
                OrderPro order = new OrderPro(account.getId(), date, totalPrice,1);
                try{
                    int orderID = orderModel.addOrder(order);
                    
                    for (Cart s : Listcart) {
                        listOrder.add(new OrderDetail(s.getName(), s.getQuantity(), s.getProductPrice(), s.getProductID(), orderID));
                    }
                    orderDetailModel.batchInsertRecordsIntoTable(listOrder);
                }catch(Exception ex){
                    System.out.println(ex);
                }
                session.removeAttribute("ListCart");
                session.removeAttribute("nextCart");
                request.getRequestDispatcher("thankforbuying.jsp").forward(request, response);
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
