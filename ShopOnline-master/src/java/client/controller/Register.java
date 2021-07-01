/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.controller;

import client.service.AccountDetailService;
import client.service.AccountService;
import config.IEmailConfig;
import config.IMessageConfig;
import entity.Account;
import entity.AccountDetail;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import utils.AutoSendMail;
import utils.GenerateRandomString;
import utils.StringUtil;

/**
 *
 * @author Derick-T
 */
@WebServlet(name = "Register", urlPatterns = {"/register"})
public class Register extends HttpServlet {

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
            // supposrt character of Unicode
            request.setCharacterEncoding("UTF-8");
            request.setCharacterEncoding("UTF-8");
            AccountService accountService = new AccountService();
            AccountDetailService accountDetailService = new AccountDetailService();
            // Get info customer
            // Account
            String email = request.getParameter("txtEmail");
            String password = request.getParameter("txtPassword");
            String passwordCf = request.getParameter("txtPasswordCf");
            // Account Detail
            String name = request.getParameter("txtName");
            String moblie = request.getParameter("txtPhone");
            String address = request.getParameter("txtAddress");
            int gender = Integer.parseInt(request.getParameter("optradio"));
            System.out.println(email + "" + password);
            int idAccountDetail = 0;
            if (!StringUtil.isEmail(email)) {
                request.setAttribute("errorMessage", IMessageConfig.EMAIL_OF_OUT);
                request.getRequestDispatcher("signup.jsp").forward(request, response);
            } else {
                if (accountService.isCheckDuplicateEmail(email)) {
                    request.setAttribute("errorMessage", IMessageConfig.DUPLICATE_EMAIL);
                    request.getRequestDispatcher("signup.jsp").forward(request, response);
                } else {
                    if (StringUtil.validatePasswordConfirm(password, passwordCf)) {
                        AccountDetail accountDetail = new AccountDetail(name, moblie, gender, address);
                        idAccountDetail = accountDetailService.addAccountDetail(accountDetail);
                        if (idAccountDetail > 0) {
                            String activeCode = GenerateRandomString.generateString(6).toUpperCase();
                            Account account = new Account(email, password, idAccountDetail, 2, 2, activeCode);
                            if (accountService.add(account)) {
                                String text = "Your active code" + activeCode;
                                AutoSendMail.sentEmail(email, IEmailConfig.SUBJECT, text);
                                HttpSession session = request.getSession();
                                session.setAttribute("currentLoginAccount", account);
                                response.sendRedirect("active.jsp");
                            }
                        }
                    } else {
                        request.setAttribute("errorMessage", IMessageConfig.PASSWORD_OF_OUT);
                        request.getRequestDispatcher("signup.jsp").forward(request, response);
                    }
                }

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
