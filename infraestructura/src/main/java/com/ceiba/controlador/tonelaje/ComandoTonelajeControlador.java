package com.ceiba.controlador.tonelaje;

import com.ceiba.comando.ComandoTonelaje;
import com.ceiba.comando.manejador.tonelaje.ManejadorCrearTonelaje;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transporte/tonelaje")
@Api
public class ComandoTonelajeControlador {
    private final ManejadorCrearTonelaje manejadorCrearTonelaje;

    public ComandoTonelajeControlador(ManejadorCrearTonelaje manejadorCrearTonelaje){
        this.manejadorCrearTonelaje = manejadorCrearTonelaje;
    }

    @PostMapping(value = "/crear-tonelaje")
    public void crear(@RequestBody ComandoTonelaje comandoTonelaje){
        this.manejadorCrearTonelaje.agregar(comandoTonelaje);
    }
}
