package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Entrada implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
   
    int id_entrada;
    
    @Basic
   
    List<Juegos> juegos;

    public Entrada() {
    }

    public Entrada(int id_entrada, List<Juegos> juegos) {
        this.id_entrada = id_entrada;
        this.juegos = juegos;
    }

    public int getId_entrada() {
        return id_entrada;
    }

    public void setId_entrada(int id_entrada) {
        this.id_entrada = id_entrada;
    }

    public List<Juegos> getJuegos() {
        return juegos;
    }

    public void setJuegos(List<Juegos> juegos) {
        this.juegos = juegos;
    }
    
    
    
}

