package com.campos.conversor.Enum;

/**
 * Created by cris on 15/03/2020.
 */
public enum CentenaPorExtensoEnum implements PalavraPorExtensoInterface{
    CEM("Cem"),
    DUZENTOS("Duzentos"),
    TREZENTOS("Trezentos"),
    QUATROCENTOS("Quatrocentos"),
    QUINHENTOS("Quinhentos"),
    SEISCENTOS("Seiscentos"),
    SETECENTOS("Setecentos"),
    OITOCENTOS("Oitocentos"),
    NOVECENTOS("Novecentos") {
    };

    private final String extenso;

    CentenaPorExtensoEnum(String extenso) {
        this.extenso = extenso;
    }

    @Override
    public String getPalavraPorExtenso(int valor) {
        return null;
    }
}