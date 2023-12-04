/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jowwcalculador;

import com.mycompany.jowwcalculador.Visao.Tela;

/**
 *
 * @author jØww
 */
public class JowwCalculador {

    public static void main(String[] args) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }
}
