package com.campos.conversor.tools;

/**
 * Created by cris on 14/03/2020.
 */
public class Utilitarios {

    public static boolean validaInteiroEntreLimites(int numeral, int minimo, int maximo){
        return (numeral >= minimo && numeral <= maximo ? true : false);
    }

}
