package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum DezenaPorExtensoEnum {
    VINTE(20, "vinte"),
    TRINTA(30, "trinta"),
    QUARENTA(40, "quarenta"),
    CINQUENTA(50, "cinquenta"),
    SESSENTA(60, "sessenta"),
    SETENTA(70, "setenta"),
    OITENTA(80, "oitenta"),
    NOVENTA(90, "noventa");

    public final String extenso;
    public final int valor;

    DezenaPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}