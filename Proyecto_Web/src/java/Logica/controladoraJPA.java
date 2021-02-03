package Logica;

import Persistencia.ControladoraPersistencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class controladoraJPA {
    private List<Usuario> listaUsuarios;
    ControladoraPersistencia controlaPersis= new ControladoraPersistencia();

    public void crearUsuario(Usuario usu) {   
        controlaPersis.crearUsuario(usu);
    }
    public void crearJuego(Juegos juego){
        controlaPersis.crearJuego(juego);
    }
    
    public void crearEmpleado(Empleado emple){
        controlaPersis.crearEmpleado(emple);
    }

    public void crearPersona(Persona perso) {
        controlaPersis.crearPersona(perso);
    }

    public boolean comprobarIngreso(String usuario, String clave) {
        
        boolean estaONo=false;

        listaUsuarios=controlaPersis.getUsuarios();
        
        for(Usuario usu:listaUsuarios){
            if(usu.getNombre_usuario().equals(usuario)&&usu.getContra().equals(clave)){
                estaONo=true;
                return estaONo;
            }
        }
        
        return estaONo;
    }

    public void crearCliente(String nombre, String apellido, int DNI, String fechaNac, String direccion, String tel) {
        
        Cliente cli = new Cliente();
            cli.setNombre(nombre);
            cli.setApellido(apellido);
            cli.setDni(DNI);
            cli.setDirección(direccion);
            cli.setFecha_nacimiento(new Date (fechaNac));
            cli.setPuntos(800);
            cli.setTelefono(DNI);
            
            
            controlaPersis.crearCliente(cli);
    }

    public void crearUsuario(String email, String contra) {
        
        //CREANDO USUARIO
            Usuario usu=new Usuario();
       
            usu.setNombre_usuario(email);
            usu.setContra(contra);
            
            controlaPersis.crearUsuario(usu);
        
    }

    public void crearEmpleado(String nombre, String apellido, int Dni, int edad, String sueldo, String puesto) {
        
        //CREANDO EMPLEADO
            
            Empleado emple = new Empleado();
            
            emple.setNombre(nombre);
            emple.setApellido(apellido);
            emple.setEdad(edad);
            emple.setDni(Dni);
            emple.setSueldo(Double.parseDouble(sueldo));
            emple.setPuesto(puesto);
            
            controlaPersis.crearEmpleado(emple);
            
    }
    
    //----------------------------------------------------------------------------
    
        public List<Empleado> getListaEmpleados(){
        List<Empleado> empleados;
        empleados=controlaPersis.getEmpleados();
        return empleados;
    }

    public void borrarEmpleado(int ID) {
        
        controlaPersis.borrarEmpleados(ID);
        
    }
    

   
         
}
