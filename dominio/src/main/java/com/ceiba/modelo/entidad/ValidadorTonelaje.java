package com.ceiba.modelo.entidad;

import com.ceiba.excepcion.ExcepcionLongitudValor;
import com.ceiba.excepcion.ExcepcionPrecioNegativo;

public class ValidadorTonelaje {

    public static void validarPrecioTonelaje(double precio, String mensaje){
        if (precio<0){
            throw new ExcepcionPrecioNegativo(mensaje);
        }
    }
    public static void validarLongitud(String valor,int longitud,String mensaje){
        if(valor.length() < longitud){
            throw new ExcepcionLongitudValor(mensaje);
        }
    }
}
