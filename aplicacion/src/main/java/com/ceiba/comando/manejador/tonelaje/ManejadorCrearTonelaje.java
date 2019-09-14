package com.ceiba.comando.manejador.tonelaje;

import com.ceiba.comando.ComandoTonelaje;
import com.ceiba.comando.fabrica.FabricaTonelaje;
import com.ceiba.modelo.entidad.Tonelaje;
import com.ceiba.servicio.ServicioCrearTonelaje;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearTonelaje {

    private final ServicioCrearTonelaje servicioCrearTonelaje;
    private final FabricaTonelaje fabricaTonelaje;

    public ManejadorCrearTonelaje(ServicioCrearTonelaje servicioCrearTonelaje,FabricaTonelaje fabricaTonelaje){
        this.servicioCrearTonelaje = servicioCrearTonelaje;
        this.fabricaTonelaje = fabricaTonelaje;
    }

    public void agregar(ComandoTonelaje comandoTonelaje){
        Tonelaje tonelaje = this.fabricaTonelaje.crear(comandoTonelaje);
        this.servicioCrearTonelaje.crear(tonelaje);
    }

    public void editar(ComandoTonelaje comandoTonelaje) {
        Tonelaje tonelaje = this.fabricaTonelaje.crear(comandoTonelaje);
        this.servicioCrearTonelaje.actualizar(tonelaje);
    }
}
