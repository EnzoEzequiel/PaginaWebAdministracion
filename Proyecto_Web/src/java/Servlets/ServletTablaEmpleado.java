/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.controladoraJPA;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author enzoe
 */
@WebServlet(name = "ServletTablaEmpleado", urlPatterns = {"/ServletTablaEmpleado"})
public class ServletTablaEmpleado extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        controladoraJPA control = new controladoraJPA();
        try
        {
             int id = Integer.parseInt(request.getParameter("ID"));
             control.borrarEmpleado(id);
        }
        catch(Exception ex)
        {

            response.sendRedirect("Error.jsp");
        }
        int id = Integer.parseInt(request.getParameter("IDinfo"));
        control.borrarEmpleado(id);
    }
    

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
