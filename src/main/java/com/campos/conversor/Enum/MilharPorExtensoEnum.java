package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum MilharPorExtensoEnum {
    MIL(1000, "Mil");

    public final String extenso;
    public final int valor;

    MilharPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}