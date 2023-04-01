/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletClasses;

import DAOClasses.InstituteDAO;
import PojoClasses.InstitutePojo;
import classes.EmailSendingClass;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hmayw
 */
public class InstituteRegistrationServlet extends HttpServlet {

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
        
        InstitutePojo obj=new InstitutePojo();
        obj.setId(request.getParameter("id"));
        obj.setName(request.getParameter("name"));
        obj.setPassword(request.getParameter("pwd"));
        obj.setAddress(request.getParameter("address"));
        obj.setPostal_code(request.getParameter("postat_code"));
        obj.setRegion(request.getParameter("region"));
        obj.setState(request.getParameter("state"));
        obj.setCity(request.getParameter("city"));
        obj.setType(request.getParameter("type"));
        obj.setWebsite(request.getParameter("website"));
        obj.setPhone(request.getParameter("contact"));
        obj.setEmail(request.getParameter("email"));
        
        ServletContext sc=request.getServletContext();
        
        try{
            boolean result=InstituteDAO.addInstitute((Connection)sc.getAttribute("conn"), obj);
            if(result==true){
                EmailSendingClass.sendMail(obj);
                RequestDispatcher rd=request.getRequestDispatcher("SuccessRegister.jsp");
                request.setAttribute("id", obj.getId());
                request.setAttribute("pwd",obj.getPassword());
                request.setAttribute("name", obj.getName());
                request.setAttribute("email",obj.getEmail());
                rd.forward(request, response);
            }
        }catch(SQLException ex){
            ex.printStackTrace( );
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
