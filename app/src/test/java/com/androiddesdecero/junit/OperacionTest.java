package com.androiddesdecero.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by albertopalomarrobledo on 20/7/17.
 */
public class OperacionTest {

    private Operacion mOperacion;

    @Before
    public void setUp(){
        mOperacion = new Operacion();
    }

    @Test
    public void operacionNotNull(){
        assertNotNull(mOperacion);
    }

    @Test
    public void suma() throws Exception {
        assertEquals("7",mOperacion.suma("3","4"));
    }

    @Test
    public void resta() throws Exception {
        assertEquals("-1", mOperacion.resta("3","4"));
    }

    @Test
    public void multiplicar() throws Exception {
        assertEquals("9", mOperacion.multiplicar("3","3"));
    }
}