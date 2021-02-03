/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Cliente;
import Logica.controladoraJPA;
import Logica.Empleado;
import Logica.Juegos;
import Logica.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "ServletRegistro", urlPatterns = {"/ServletRegistro"})
public class ServletRegistro extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

   
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       
            controladoraJPA control = new controladoraJPA();
            
            //DATOS PEDIDO DE USUARIO
            String email=request.getParameter("email");
            String contra=request.getParameter("password");
            //DATOS PEDIDOS DE EMPLEADO
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            int Dni = Integer.parseInt(request.getParameter("dni"));
            //Date fechaNac = Date.parse(request.getParameter("fechaNacimiento"));
            
            int edad=Integer.parseInt(request.getParameter("edad"));
            String sueldo=request.getParameter("sueldo");
            String puesto=request.getParameter("puesto");
            
            control.crearEmpleado(nombre,apellido,Dni,edad,sueldo,puesto);
            control.crearUsuario(email,contra);
            
            
            
            response.sendRedirect("Login.jsp");
            
            
            //emple.setPuestos();
            /*cli.setDni(Dni);
            cli.setDirección(direcion);
            cli.setFecha_nacimiento(new Date (fechaNac));
            cli.setPuntos(6876);
            cli.setTelefono(31241352);
            control.crearCliente(cli);
            response.sendRedirect("Principal.jsp");
            */
            
    }

    
    
    
    
    
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
