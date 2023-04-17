package org.jose.junit5;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta(){
        Cuenta cuenta=new Cuenta("Jose", new BigDecimal("10.50"));

        assertEquals("Jose",cuenta.getNombre());
    }

}