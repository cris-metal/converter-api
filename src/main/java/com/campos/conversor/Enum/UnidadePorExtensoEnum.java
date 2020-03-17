package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum UnidadePorExtensoEnum {
    UM(1, "Um"),
    DOIS(2, "Dois"),
    TRES(3, "Três"),
    QUATRO(4, "Quatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SETE(7, "Sete"),
    OITO(8, "Oito"),
    NOVE(9, "Nove"),
    DEZ(10, "Dez"),
    ONZE(11, "Onze"),
    DOZE(12, "Doze"),
    TREZE(13, "Treze"),
    QUATORZE(14, "Quatorze"),
    QUINZE(15, "Quinze"),
    DEZESSEIS(16, "Dezesseis"),
    DEZESSETE(17, "Dezessete"),
    DEZOITO(18, "Dezoito"),
    DEZENOVE(19, "Dezenove");

    public final String extenso;
    public final int valor;

    UnidadePorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}