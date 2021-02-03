
package Servlets;

import Logica.controladoraJPA;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletLogin", urlPatterns = {"/ServletLogin"})
public class ServletLogin extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //proceso de request
        
        
        boolean estaONo=false;
        controladoraJPA control=new controladoraJPA();
        estaONo=control.comprobarIngreso(request.getParameter("usuario"), request.getParameter("pass"));
        
        if(estaONo==true){
            //
            HttpSession misession=request.getSession(true);
            String usuario=request.getParameter("usuario");
            String clave=request.getParameter("pass");
            //
            misession.setAttribute("usuario", usuario);
            misession.setAttribute("pass", clave);
            //
            response.sendRedirect("index.jsp");
            
        }
        else{
            
            //PARA QUE TE LLEVE AL LOGIN EN CASO DE NO SER CORERCTO
            response.sendRedirect("LoginError.jps");
            
        }
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
