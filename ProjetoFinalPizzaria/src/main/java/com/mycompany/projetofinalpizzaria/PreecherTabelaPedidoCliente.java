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
public class PreecherTabelaPedidoCliente {
    //gera modelo pra tabela de Pedidos do cliente
     public DefaultTableModel gerarModelo2(Cliente cliente){
        String [] colunas = {"N° Pedido", "Valor", "Estado"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0){
            //Classe anonima para impedir a edição da celula
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; 
            }
        };        
        BancoDados banco = BancoDados.getInstance();
        for(int i = 0; i<banco.getListaPedido().size();i++){
            double precoTotal = banco.getListaPedido().get(i).getPrecoTotal();
            if(banco.getListaPedido().get(i).getCliente().getTelefone().equals(cliente.getTelefone())){
                Object [] linha= {
                banco.getListaPedido().get(i).getIdPedido(),
                String.format("R$ %.2f", precoTotal),
                banco.getListaPedido().get(i).getEstado().getNome()
            };
            modelo.addRow(linha);
            }  
        }
        return modelo;
    }
}
