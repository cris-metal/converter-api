package com.campos.conversor.service;

import com.campos.conversor.Enum.CentenaPorExtensoEnum;
import com.campos.conversor.Enum.DezenaPorExtensoEnum;
import com.campos.conversor.Enum.MilharPorExtensoEnum;
import com.campos.conversor.Enum.UnidadePorExtensoEnum;
import com.campos.conversor.exception.ConversorException;
import com.campos.conversor.tools.Utilitarios;
import org.springframework.stereotype.Service;

import java.util.InputMismatchException;

/**
 * Created by cris on 14/03/2020.
 */
@Service
public class ConversorService {
    private final int VALOR_MINIMO = -99999;
    private final int VALOR_MAXIMO = 99999;
    private final int MIL = 1000;
    private final int CEM = 100;
    private final int VINTE = 20;
    /**
     * metodo responsável pela transcrição do @numeral passado por parametro para palavras em português.
     * @param numeral
     * @return
     */
    public String converteNumeralParaExtenso(int numeral){
            if (!Utilitarios.validaInteiroEntreLimites(numeral, VALOR_MINIMO, VALOR_MAXIMO)) {
                throw new ConversorException("Valores fora do intervalo (-99999..99999):");
            }

            return montaValorExtenso(numeral);
    }

    /**
     * Trata a parte unitaria no numeral (1..19;-1..-19)
     * @param numeral
     * @return
     */
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

    /**
     * Trata a parte de dezena do numeral (20..99;-20..-99)
     * @param numeral
     * @return
     */
    private String montaDezena(int numeral){
        String valorExtenso = "";
        for (DezenaPorExtensoEnum dezena : DezenaPorExtensoEnum.values()){
            if (dezena.valor <= numeral && dezena.valor + 10 > numeral){
                valorExtenso = dezena.extenso;
                if ((numeral - dezena.valor) > 0) {
                    valorExtenso += " e " + this.converteNumeralParaExtenso(numeral - dezena.valor);
                }
                break;
            }
        }
        return valorExtenso;
    }

    /**
     * Trata a parte de centena do numeral (100..999;-100..-999)
     * @param numeral
     * @return
     */
    private String montaCentena(int numeral){
        String valorExtenso = "";

        if (numeral == 100) {
            valorExtenso = CentenaPorExtensoEnum.CEM.extenso;
        }else {
            for (CentenaPorExtensoEnum centena : CentenaPorExtensoEnum.values()) {
                if (centena.valor <= numeral && centena.valor + 100 > numeral) {
                    if ((numeral - centena.valor) > 0) {
                        valorExtenso = (numeral < 200 ? CentenaPorExtensoEnum.CENTO.extenso : centena.extenso) + " e " + this.converteNumeralParaExtenso(numeral - centena.valor);
                    } else {
                        valorExtenso = centena.extenso;
                    }
                    break;
                }
            }
        }
        return valorExtenso;
    }

    /**
     * Trata a parte milhar do numeral (1000..9999;-1000..-9999)
     * @param numeral
     * @return
     */
    private String montaMilhar(int numeral){
        String valorExtenso = "";
        if (MilharPorExtensoEnum.MIL.valor <= numeral){
            int milha = Math.abs(numeral / 1000);
            int centena = numeral % 1000;

            valorExtenso += (milha > 1 || milha < -1 ? this.converteNumeralParaExtenso(milha) : "") + " " + MilharPorExtensoEnum.MIL.extenso + " e " + this.montaValorExtenso(centena);
        }
        return valorExtenso;
    }

    private String montaValorExtenso(int numeral){
        try {
            boolean positivo = true;
            if (numeral < 0) {
                numeral = numeral * -1;
                positivo = false;
            }
            if (numeral >= this.MIL) {
                return (positivo ? "" : "menos ") + montaMilhar(numeral);
            } else if (numeral >= this.CEM && numeral <= this.MIL) {
                return (positivo ? "" : "menos ") + montaCentena(numeral);
            } else if (numeral >= this.VINTE && numeral < this.CEM) {
                return (positivo ? "" : "menos ") + montaDezena(numeral);
            } else {
                return (positivo ? "" : "menos ") + montaUnidade(numeral);
            }
        }catch (ConversorException e){
            throw new ConversorException("Erro na conversão do numeral para valor por extenso.");
        }
    }
}
