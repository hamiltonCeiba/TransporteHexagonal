package com.ceiba.adaptador.repositorio.implementacion;

import com.ceiba.adaptador.repositorio.Conversor.ConversorAEntidades;
import com.ceiba.adaptador.repositorio.TonelajeRepositoryJPA;
import com.ceiba.modelo.entidad.Tonelaje;
import com.ceiba.puerto.repositorio.RepositorioTonelaje;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioTonelajeImpl implements RepositorioTonelaje {

    TonelajeRepositoryJPA tonelajeRepositoryJPA;

    public RepositorioTonelajeImpl(TonelajeRepositoryJPA tonelajeRepositoryJPA){
        System.err.println("pasó por tonelajeRepositoryImpl");
        this.tonelajeRepositoryJPA = tonelajeRepositoryJPA;
    }

    @Override
    public void crear(Tonelaje tonelaje) {
        this.tonelajeRepositoryJPA.save(ConversorAEntidades.convertirATonelajeEntidad(tonelaje));
    }

    @Override
    public void editar(Tonelaje tonelaje) {
        this.tonelajeRepositoryJPA.delete(ConversorAEntidades.convertirATonelajeEntidad(tonelaje));
        this.tonelajeRepositoryJPA.save(ConversorAEntidades.convertirATonelajeEntidad(tonelaje));
    }
}
