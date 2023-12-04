/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jowwcalculador.controle;

import com.mycompany.jowwcalculador.enums.EnumOperacao;

/**
 *
 * @author jØww
 */
public class CalculadoraController 
{
    private Double total;
    
    public CalculadoraController()
    {
        total = 0.0;
    }
    
    public Double realizaOperacao(EnumOperacao operacao, Double valor)
    {
        switch (operacao) {
            case SOMA:
                total += valor;
                break;
            case SUBTRACAO:
                total -= valor;
                break;
            case DIVISAO:
                total /= valor;
                break;
            case MULTIPLICACAO:
                total *= valor;
                break;
            default:
                break;
        }
        return total;        
    }
    public Double getTotal()
    {
        return this.total;
    }
    public void zerar() {
        total = 0.0;
    }
}
