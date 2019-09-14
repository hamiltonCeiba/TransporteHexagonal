package com.ceiba.adaptador.repositorio.Conversor;

import com.ceiba.adaptador.repositorio.dao.entidad.TonelajeEntidad;
import com.ceiba.modelo.entidad.Tonelaje;

public final class ConversorAEntidades {

    public static Tonelaje convertirATonelaje(TonelajeEntidad entidad) {
        return new Tonelaje(entidad.getRango(),  entidad.getPrecio());
    }

    public static TonelajeEntidad convertirATonelajeEntidad(Tonelaje entidad) {
        return new TonelajeEntidad(entidad.getRango(),  entidad.getPrecio());
    }

    /*public static Conductor convertConductorRequestToConductor(ConductorRequest conductorRequest) {
        return new Conductor(conductorRequest.getId(),conductorRequest.getCedula(), conductorRequest.getPrimerNombre(),
                conductorRequest.getSegundoNombre(), conductorRequest.getPrimerApellido(),
                conductorRequest.getSegundoApellido(), conductorRequest.getCelular());
    }

    public static Servicio convertRequestToService(ServicioRequest request) {
        return new Servicio(request.getDistanciaKm()
                ,request.getDireccionInicial()
                ,request.getDireccionFinal()
                ,request.getMunicipioFinal()
                ,request.getTotalServ()
                ,ConvertirRequestAEntidades.convertVehiculoRequestToVehiculo(request.getVehiculo())
                ,ConvertirRequestAEntidades.convertConductorRequestToConductor(request.getConductor()));
    }

    public static Vehiculo convertVehiculoRequestToVehiculo(VehiculoRequest vehiculoRequest) {

        return new Vehiculo(vehiculoRequest.getIdVehiculo(), vehiculoRequest.getPlaca(),
                vehiculoRequest.getModelo(), vehiculoRequest.getSoat(),
                vehiculoRequest.getTecnomecanico(),
                vehiculoRequest.getCapacidad(), vehiculoRequest.isDisponible(),
                convertToTonelaje(vehiculoRequest.getTonelaje()));
    }
    */

}
