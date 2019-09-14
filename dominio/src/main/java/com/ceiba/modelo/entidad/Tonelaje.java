package com.ceiba.modelo.entidad;

public class Tonelaje {
    private static final String PRECIO_NEGATIVO = "El precio no puede ser negativo";
    private static final String VALOR_VACIO = "El campo no puede estar vacio";
    private String rango;
    private double precio;

    public Tonelaje(String rango, double precio) {
        ValidadorTonelaje.validarPrecioTonelaje(precio,PRECIO_NEGATIVO);
        ValidadorTonelaje.validarLongitud(rango,1,VALOR_VACIO);
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
