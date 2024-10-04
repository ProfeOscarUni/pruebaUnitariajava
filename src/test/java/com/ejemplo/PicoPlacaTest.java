package com.ejemplo;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PicoPlacaTest {
    @Test
    public void testNoSaleLunes(){
        //Arrange
        PicoPlaca servicio = new PicoPlaca();
        //act
        boolean resultado = servicio.permitir(Ciudad.CALI, Dias.LUNES, "ABC123");
        //assert
        assertFalse(resultado);

    }
    @Test
    public void testSaleLunes(){
        PicoPlaca servicio = new PicoPlaca();
        boolean resultado = servicio.permitir(Ciudad.CALI, Dias.LUNES, "ABC123");
        assertFalse(resultado);
    
    }
    @Test
    public void testPlacaNula(){
        assertThrows(IllegalArgumentException.class,()->{
        PicoPlaca servicio = new PicoPlaca();
        servicio.permitir(Ciudad.CALI, Dias.LUNES, null);
        });
    }
}
