package com.campos.conversor.service;

import com.campos.conversor.Enum.UnidadePorExtensoEnum;
import com.campos.conversor.tools.Utilitarios;
import org.springframework.core.env.Environment;

/**
 * Created by cris on 14/03/2020.
 */
public class ConversorService {

    private Environment ambiente;
    private final int MIL = 1000;
    private final int CEM = 100;
    private final int VINTE = 20;
    /**
     * metodo responsável pela transcrição do @numeral passado por parametro para palavras em português.
     * @param numeral
     * @return
     */
    public String converteNumeralParaExtenso(int numeral){
        try{
            if (!Utilitarios.validaInteiroEntreLimites(numeral, Integer.parseInt(ambiente.getProperty("numeral.valor.minimo")), Integer.parseInt(ambiente.getProperty("numeral.valor.maximo"))))
                return "Número fora da faixa";

            if (numeral >= this.MIL){

            }else if (numeral >= this.CEM){

            }else if (numeral >= this.VINTE){

            }else {
                return montaUnidade(numeral);
            }

        }catch (Exception e){

        }
        return "";
    }

    private String montaUnidade(int numeral){
        String valorExtenso = "";
        for (UnidadePorExtensoEnum unidade : UnidadePorExtensoEnum.values()){
            if (unidade.valor == numeral){
                valorExtenso = unidade.extenso;
            }
        }
        return valorExtenso;
    }
}
