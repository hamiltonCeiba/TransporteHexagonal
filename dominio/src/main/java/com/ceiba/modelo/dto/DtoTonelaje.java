package com.ceiba.modelo.dto;


public class DtoTonelaje {
    private String rango;
    private double precio;

    public DtoTonelaje(String rango, double precio) {
        this.rango = rango;
        this.precio = precio;
    }

    public String getRango() {
        return rango;
    }

    public double getPrecio() {
        return precio;
    }
}
