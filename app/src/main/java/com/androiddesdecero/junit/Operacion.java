package com.androiddesdecero.junit;

/**
 * Created by albertopalomarrobledo on 20/7/17.
 */

public class Operacion {
    public String suma(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) + Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String resta(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) - Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }

    public String multiplicar(String numero1, String numero2){
        int resultado = Integer.valueOf(numero1) * Integer.valueOf(numero2);
        return String.valueOf(resultado);
    }
}
