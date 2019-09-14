package com.ceiba.puerto.dao;

import com.ceiba.modelo.entidad.Tonelaje;

import java.util.List;

public interface DaoTonelaje {
    /**
     * Retorna la lista de tonelajes registrados en la bd
     * @return
     */
    List<Tonelaje> listar();
}
