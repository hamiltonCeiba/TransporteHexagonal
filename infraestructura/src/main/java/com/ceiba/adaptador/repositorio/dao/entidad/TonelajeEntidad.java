package com.ceiba.adaptador.repositorio.dao.entidad;


import javax.persistence.*;

@Entity
@Table(name = "TonelajeEntidad")
public class TonelajeEntidad {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "rango")
    private String rango;
    @Column(name = "precio")
    private double precio;

    public TonelajeEntidad(String rango, double precio){
        this.rango = rango;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
