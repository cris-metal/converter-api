package com.campos.conversor.service;

import com.campos.conversor.Enum.CentenaPorExtensoEnum;
import com.campos.conversor.Enum.DezenaPorExtensoEnum;
import com.campos.conversor.Enum.MilharPorExtensoEnum;
import com.campos.conversor.Enum.UnidadePorExtensoEnum;
import com.campos.conversor.tools.PropriedadesApp;
import com.campos.conversor.tools.Utilitarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by cris on 14/03/2020.
 */
@Service
public class ConversorService {

    @Autowired
    private PropriedadesApp propriedadesApp;

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
            if (!Utilitarios.validaInteiroEntreLimites(numeral, Integer.parseInt("-99999"), Integer.parseInt("99999")))
                return "Número fora da faixa";

            if (numeral >= this.MIL){

            }else if (numeral >= this.CEM && numeral <= this.MIL){
                return montaCentena(numeral);

            }else if (numeral >= this.VINTE && numeral < this.CEM){
                return montaDezena(numeral);
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
                break;
            }
        }
        return valorExtenso;
    }

    private String montaDezena(int numeral){
        String valorExtenso = "";
        for (DezenaPorExtensoEnum dezena : DezenaPorExtensoEnum.values()){
            if (dezena.valor <= numeral && dezena.valor + 10 > numeral){
                valorExtenso = dezena.extenso;
                valorExtenso += " e " + this.converteNumeralParaExtenso(numeral - dezena.valor);
             //   valorExtenso += " e " + montaUnidade(numeral - dezena.valor);
                break;
            }
        }
        return valorExtenso;
    }

    private String montaCentena(int numeral){
        String valorExtenso = "";
        for (CentenaPorExtensoEnum centena : CentenaPorExtensoEnum.values()){
            if (centena.valor <= numeral && centena.valor + 100 > numeral){
                valorExtenso = centena.extenso;
                valorExtenso += " e " + this.converteNumeralParaExtenso(numeral - centena.valor);
                break;
            }
        }
        return valorExtenso;
    }

    private String montaMilhar(int numeral){
        String valorExtenso = "";
        for (MilharPorExtensoEnum milhar : MilharPorExtensoEnum.values()){
            if (milhar.valor == numeral){
                valorExtenso = milhar.extenso;
                break;
            }
        }
        return valorExtenso;
    }
}
