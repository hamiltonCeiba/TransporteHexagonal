package com.ceiba.servicio;

import com.ceiba.modelo.entidad.Tonelaje;
import com.ceiba.puerto.repositorio.RepositorioTonelaje;

public class ServicioCrearTonelaje {
    private RepositorioTonelaje repositorioTonelaje;

    public ServicioCrearTonelaje(RepositorioTonelaje repositorioTonelaje){
        this.repositorioTonelaje = repositorioTonelaje;
    }
    public void crear(Tonelaje tonelaje){
        this.repositorioTonelaje.crear(tonelaje);
    }
    public void actualizar(Tonelaje tonelaje){
        this.repositorioTonelaje.editar(tonelaje);
    }
}
