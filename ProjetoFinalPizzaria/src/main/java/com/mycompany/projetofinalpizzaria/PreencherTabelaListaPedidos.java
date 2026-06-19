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
public class PreencherTabelaListaPedidos {
    //Gera modelo de tabela ja preenchido com os dados do banco de dados com os dados dos pedidos
    public DefaultTableModel gerarModelo(){
        String [] colunas = {"N° Pedido", "Quantidade Pizza(s)", "Estado", "Valor"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0){
            //Classe anonima para impedir a edição da celula
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; 
            }
        };        
        BancoDados banco = BancoDados.getInstance();
        for(int i = 0; i<banco.getListaPedido().size();i++){
            Object [] linha= {
                banco.getListaPedido().get(i).getIdPedido(),
                banco.getListaPedido().get(i).getPizza().size(),
                banco.getListaPedido().get(i).getEstado().getNome(),
                banco.getListaPedido().get(i).getPrecoTotal()
            };
            modelo.addRow(linha);
        }
        return modelo;
    }
}
