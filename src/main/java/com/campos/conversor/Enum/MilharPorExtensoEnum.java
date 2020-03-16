package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum MilharPorExtensoEnum implements PalavraPorExtensoInterface{
    MIL(1000, "Mil");
    private final String extenso;

    MilharPorExtensoEnum(int valor, String extenso) {
        this.extenso = extenso;
    }

    @Override
    public String getPalavraPorExtenso(int valor) {
        return null;
    }
}