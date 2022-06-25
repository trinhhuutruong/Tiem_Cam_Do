/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import dao.BillDAO;
import dao.ItemDAO;
import dto.BillDTO;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Admin
 */
public class Bill extends HttpServlet {

    private final String ERROR_PAGE = "wrong.html";
    private final String HOME_PAGE = "bill.jsp";

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
//        String username = request.getParameter("userName");
//        String password = request.getParameter("password");
        String url = HOME_PAGE;
        try {
            BillDAO daoBill = new BillDAO();
            ItemDAO daoItem = new ItemDAO();
            ArrayList<BillDTO> bil = daoBill.getAllBill();
            System.out.println("size: "+bil.size());
            for(BillDTO b: bil){
                System.out.println("billID: "+b.getBillID());
                System.out.println("itemID: "+b.getItemID());
                System.out.println("pawnMoney: "+b.getPawnMoney());
                System.out.println("numberDays: "+b.getNumberDays());
                System.out.println("interestRate: "+b.getInterestRate());
                System.out.println("billBeginDate: "+b.getBillBeginDate());
                System.out.println("staffID: "+b.getStaffID().getStaffID());
                System.out.println("returnMoney: "+b.getReturnMoney());

            }
            HttpSession session = request.getSession();
            session.setAttribute("bill", bil);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
