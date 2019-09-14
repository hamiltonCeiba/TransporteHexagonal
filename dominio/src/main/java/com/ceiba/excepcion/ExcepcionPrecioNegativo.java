package com.ceiba.excepcion;

public class ExcepcionPrecioNegativo extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public ExcepcionPrecioNegativo(String mensaje){
        super(mensaje);
    }
}
