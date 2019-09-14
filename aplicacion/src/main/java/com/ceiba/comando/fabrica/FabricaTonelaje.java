package com.ceiba.comando.fabrica;

import com.ceiba.comando.ComandoTonelaje;
import com.ceiba.modelo.entidad.Tonelaje;
import org.springframework.stereotype.Component;

@Component
public class FabricaTonelaje {
    public Tonelaje crear(ComandoTonelaje comandoTonelaje) {
        return new Tonelaje(comandoTonelaje.getRango(),comandoTonelaje.getPrecio());
    }

    public Tonelaje editar(ComandoTonelaje comandoTonelaje){
        return new Tonelaje(comandoTonelaje.getRango(),comandoTonelaje.getPrecio());
    }
}
