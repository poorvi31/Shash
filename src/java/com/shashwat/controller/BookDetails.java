/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.shashwat.controller;

import com.shashwat.model.Subscription;
import com.shashwat.model.SubscriptionDTO;
import com.shashwat.model.UserDAO;
import com.shashwat.model.manager.BookDAO;
import com.shashwat.model.manager.BookDTO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 *
 * @author jay
 */
public class BookDetails extends HttpServlet {

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
          
            int bookId =Integer.parseInt( request.getParameter("book"));
             
            HttpSession session = request.getSession();
            ArrayList<BookDAO> al = new ArrayList<>();
            
            BookDTO bookdto = new BookDTO();

            //             -------------getBookDetail BookDAO 
            if (bookdto.getBookDetail(al,bookId)) {
                session.setAttribute("bookdetails", al);
                
                
//                -------------Subscription dao 
//                Subscription subdao = new Subscription();
//                UserDAO udao = (UserDAO) session.getAttribute("udao");
//                subdao.setId(udao.getId());
//                subdao.setIsSubscribed(false);
//                SubscriptionDTO subdto = new SubscriptionDTO();
                
//                if (subdto.getSubscription(subdao)) {
//                    response.sendRedirect("./UserView/Home.jsp");
//                    session.setAttribute("subdao", subdao);
//                } else {
//                    
                    response.sendRedirect("./UserView/BookDetails.jsp");
//                }
                
            } else {
                response.sendRedirect("./UserView/Home.jsp");
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
