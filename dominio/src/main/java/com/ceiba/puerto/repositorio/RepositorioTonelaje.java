package com.ceiba.puerto.repositorio;

import com.ceiba.modelo.entidad.Tonelaje;

public interface RepositorioTonelaje {
    /**
     * Permite registrar un tonelaje
     * @param tonelaje
     */
    void crear(Tonelaje tonelaje);

    /**
     * Actualiza el tonelaje que se le envíe
     * @param tonelaje
     */
    void editar(Tonelaje tonelaje);
}
