package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum CentenaPorExtensoEnum {
    CEM(100, "Cem"),
    DUZENTOS(200, "Duzentos"),
    TREZENTOS(300, "Trezentos"),
    QUATROCENTOS(400, "Quatrocentos"),
    QUINHENTOS(500, "Quinhentos"),
    SEISCENTOS(600, "Seiscentos"),
    SETECENTOS(700, "Setecentos"),
    OITOCENTOS(800, "Oitocentos"),
    NOVECENTOS(900, "Novecentos");

    public final String extenso;
    public final int valor;

    CentenaPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}