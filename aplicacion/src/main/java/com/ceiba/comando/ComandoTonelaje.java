package com.ceiba.comando;


public class ComandoTonelaje {
    private String rango;
    private double precio;

    public ComandoTonelaje(String rango, double precio) {
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
