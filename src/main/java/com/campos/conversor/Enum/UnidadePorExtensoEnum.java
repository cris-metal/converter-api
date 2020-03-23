package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum UnidadePorExtensoEnum {
    ZERO(0, "zero"),
    UM(1, "um"),
    DOIS(2, "dois"),
    TRES(3, "três"),
    QUATRO(4, "quatro"),
    CINCO(5, "cinco"),
    SEIS(6, "seis"),
    SETE(7, "sete"),
    OITO(8, "oito"),
    NOVE(9, "nove"),
    DEZ(10, "dez"),
    ONZE(11, "onze"),
    DOZE(12, "doze"),
    TREZE(13, "treze"),
    QUATORZE(14, "quatorze"),
    QUINZE(15, "quinze"),
    DEZESSEIS(16, "dezesseis"),
    DEZESSETE(17, "dezessete"),
    DEZOITO(18, "dezoito"),
    DEZENOVE(19, "dezenove");

    public final String extenso;
    public final int valor;

    UnidadePorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
        this.valor = valor;
    }
}