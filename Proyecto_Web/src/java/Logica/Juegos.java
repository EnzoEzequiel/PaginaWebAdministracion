package Logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

@Entity
public class Juegos implements Serializable {
    
    @Id
    @GeneratedValue (strategy=GenerationType.SEQUENCE)
    private int idJuego;
    
    @Basic
    private String nombreJuego;

    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaComienzo;
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaFinal;
    
    private int edadMinima;
    
    @OneToMany
    private List <Empleado> empleados;

    public Juegos() {
    }

    public Juegos(int idJuego, String nombreJuego, Date horaComienzo, Date horaFinal, int edadMinima, List<Empleado> empleados) {
        this.idJuego = idJuego;
        this.nombreJuego = nombreJuego;
        this.horaComienzo = horaComienzo;
        this.horaFinal = horaFinal;
        this.edadMinima = edadMinima;
        this.empleados = empleados;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public Date getHoraComienzo() {
        return horaComienzo;
    }

    public void setHoraComienzo(Date horaComienzo) {
        this.horaComienzo = horaComienzo;
    }

    public Date getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(Date horaFinal) {
        this.horaFinal = horaFinal;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
    
}