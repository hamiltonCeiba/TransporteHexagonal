package com.ceiba.consulta.manejador;

import com.ceiba.modelo.entidad.Tonelaje;
import com.ceiba.puerto.dao.DaoTonelaje;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTonelaje {
    private final DaoTonelaje daoTonelaje;

    public ManejadorListarTonelaje(DaoTonelaje daoTonelaje){
        this.daoTonelaje = daoTonelaje;
    }
    public List<Tonelaje> listar(){
        return this.daoTonelaje.listar();
    }
}
