package Persistencia;

import Logica.Cliente;
import Logica.Empleado;
import Logica.Entrada;
import Logica.Juegos;
import Logica.Persona;
import Logica.Usuario;
import Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author samuel
 */
public class ControladoraPersistencia {
    
    PersonaJpaController persoJPA = new PersonaJpaController();
    ClienteJpaController clientJPA = new ClienteJpaController ();
    EmpleadoJpaController empJPA = new EmpleadoJpaController ();
    EntradaJpaController entJPA = new EntradaJpaController ();
    JuegosJpaController juegoJPA = new JuegosJpaController ();
    UsuarioJpaController usuJPA = new UsuarioJpaController ();
    
    
    public void crearPersona (Persona perso){
                
        try
        {
            persoJPA.create(perso);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    public void crearCliente (Cliente client){
                
        try
        {
            clientJPA.create(client);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
        public void crearEmpleado (Empleado emp){
                
        try
        {
            empJPA.create(emp);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
        public void crearEntrada (Entrada ent){
                
        try
        {
            entJPA.create(ent);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
        
        public void crearJuego (Juegos juego){
                
        try
        {
            juegoJPA.create(juego);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
        public void crearUsuario (Usuario usu){
                
        try
        {
            usuJPA.create(usu);
        }
        catch (Exception ex)
        {
           Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    //--------------------------------------------------------------------
        
       public List<Usuario> getUsuarios() {
           List<Usuario> listaUsuarios;
           
       listaUsuarios=usuJPA.findUsuarioEntities();
       
       return listaUsuarios;
    }
        
    //-------------------------------------------------------------------
       
         public List<Cliente> getClientes() {
             
             List <Cliente> clients;
             clients = clientJPA.findClienteEntities();
             return clients;
        
    }
         
         
    //-------------------------------------------------------------------     
     
         public void borrarCliente(int id)
         {
        try {
            clientJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
//--------------------------------------------------------------------------------------
         
         
       public List<Empleado> getEmpleados() {
       List<Empleado> listaEmpleados;
       listaEmpleados=empJPA.findEmpleadoEntities();
       
       return listaEmpleados;
       
        
    }

    public void borrarEmpleados(int ID) {
        
        try {
            empJPA.destroy(ID);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

