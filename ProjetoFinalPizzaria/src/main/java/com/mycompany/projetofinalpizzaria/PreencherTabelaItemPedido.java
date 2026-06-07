/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kauan
 */
public class PreencherTabelaItemPedido {
    public DefaultTableModel gerarModelo3(Pizza pizza, double valor, String forma){
        String [] colunas = {"Sabores", "Forma", "Valor"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0){
            //Classe anonima para impedir a edição da celula
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; 
            }
        };        
        
        Object [] linha= {
            pizza.getSabor().toString(),
            pizza.getForma().getClass().getSimpleName(),
            String.format("R$ %.2f", valor)
        };
        modelo.addRow(linha); 
        return modelo;
    }   
}
