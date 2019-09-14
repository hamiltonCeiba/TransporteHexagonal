package com.ceiba.modelo;

import com.ceiba.BasePrueba;
import com.ceiba.excepcion.ExcepcionPrecioNegativo;
import com.ceiba.excepcion.ExcepcionValorObligatorio;
import com.ceiba.testdatabuilder.TonelajeTestDataBuilder;
import org.junit.Test;

public class TonelajeTest {

    private static final double VALOR_NEGATIVO = -1;

    @Test
    public void ValidarRangoObligatorio(){
        //Arrange
        TonelajeTestDataBuilder tonelajeTestDataBuilder = new TonelajeTestDataBuilder();
        tonelajeTestDataBuilder.conPrecio(VALOR_NEGATIVO);
        //Act - Assert
        BasePrueba.assertThrows(() -> tonelajeTestDataBuilder.Construir(), ExcepcionPrecioNegativo.class, "El precio no puede ser negativo");
    }

    public void validarNombreObligatorio() {
        //Arrange
        TonelajeTestDataBuilder tonelajeTestDataBuilder = new TonelajeTestDataBuilder();
        tonelajeTestDataBuilder.conRango(null);
        //Act - Assert
        BasePrueba.assertThrows(() -> tonelajeTestDataBuilder.Construir(), ExcepcionValorObligatorio.class,"El campo no puede estar vacio");
    }
}
