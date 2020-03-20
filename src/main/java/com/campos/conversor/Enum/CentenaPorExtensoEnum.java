package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum CentenaPorExtensoEnum {
    CEM(100, "cem"),
    CENTO(100, "cento"),
    DUZENTOS(200, "duzentos"),
    TREZENTOS(300, "trezentos"),
    QUATROCENTOS(400, "quatrocentos"),
    QUINHENTOS(500, "quinhentos"),
    SEISCENTOS(600, "seiscentos"),
    SETECENTOS(700, "setecentos"),
    OITOCENTOS(800, "oitocentos"),
    NOVECENTOS(900, "novecentos");

    public final String extenso;
    public final int valor;

    CentenaPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}