package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum DezenaPorExtensoEnum {
    VINTE(20, "Vinte"),
    TRINTA(30, "Trinta"),
    QUARENTA(40, "Quarenta"),
    CINQUENTA(50, "Cinquenta"),
    SESSENTA(60, "Sessenta"),
    SETENTA(70, "Setenta"),
    OITENTA(80, "Oitenta"),
    NOVENTA(90, "Noventa");

    public final String extenso;
    public final int valor;

    DezenaPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}