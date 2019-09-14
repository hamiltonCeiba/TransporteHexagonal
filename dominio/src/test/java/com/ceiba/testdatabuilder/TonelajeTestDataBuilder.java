package com.ceiba.testdatabuilder;

import com.ceiba.modelo.entidad.Tonelaje;

public class TonelajeTestDataBuilder {

    private String rango;
    private double precio;

    public TonelajeTestDataBuilder(){
        this.precio = 5000;
        this.rango = "0 - 1 Tonelada";
    }

    public TonelajeTestDataBuilder conRango(String rango){
        this.rango = rango;
        return this;
    }
    public TonelajeTestDataBuilder conPrecio(double precio){
        this.precio = precio;
        return this;
    }

    public Tonelaje Construir(){
        return new Tonelaje(this.rango,this.precio);
    }
}
