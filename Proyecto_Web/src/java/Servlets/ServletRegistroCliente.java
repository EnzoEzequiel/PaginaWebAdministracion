/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.controladoraJPA;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author enzoe
 */
@WebServlet(name = "ServletRegistroCliente", urlPatterns = {"/ServletRegistroCliente"})
public class ServletRegistroCliente extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
            controladoraJPA control = new controladoraJPA();
            try {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int DNI = Integer.parseInt(request.getParameter("dni"));
            String fechaNac = request.getParameter("fechaNacimiento");
            String direccion = request.getParameter("direccion");
            String tel = request.getParameter("telefono");
            
            
            
            control.crearCliente(nombre,apellido,DNI,fechaNac,direccion,tel);
            response.sendRedirect("index.jsp");

            }
            catch(Exception ex)
            {
                response.sendRedirect("Login.jsp");
                
            }
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
