package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum DezenaPorExtensoEnum implements PalavraPorExtensoInterface{
    VINTE("Vinte"),
    TRINTA("Trinta"),
    QUARENTA("Quarenta"),
    CINQUENTA("Cinquenta"),
    SESSENTA("Sessenta"),
    SETENTA("Setenta"),
    OITENTA("Oitenta"),
    NOVENTA("Noventa");

    private final String extenso;

    DezenaPorExtensoEnum(String extenso) {
        this.extenso = extenso;
    }

    @Override
    public String getPalavraPorExtenso(int valor) {
        return null;
    }
}