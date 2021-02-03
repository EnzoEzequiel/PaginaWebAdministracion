package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
//no estaria utilizando herencia 
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Persona implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    protected int id_persona;
    
    
    @Basic
    protected int edad;
    protected String nombre;
    protected String apellido;
    protected int dni;
    @Temporal(TemporalType.DATE)
    protected Date fecha_nacimiento;

    
    
    public Persona() {
    }

    public Persona(int id_persona, int edad, String nombre, String apellido, int dni, Date fecha_nacimiento) {
        this.id_persona = id_persona;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    
    
}
