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
public class PreencherTabelaCliente {
    //Gera modelo de tabela ja preenchido com os dados do banco de dados com os dados dos clientes
    public DefaultTableModel gerarModelo(){
        String [] colunas = {"Nome", "Sobrenome", "Telefone"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0){
            //Classe anonima para impedir a edição da celula
            @Override
            public boolean isCellEditable(int row, int column) {
            return false; 
            }
        };        
        BancoDados banco = BancoDados.getInstance();
        for(int i = 0; i<banco.getListaCliente().size();i++){
            Object [] linha= {
                banco.getListaCliente().get(i).getNome(),
                banco.getListaCliente().get(i).getSobrenome(),
                banco.getListaCliente().get(i).getTelefone()
            };
            modelo.addRow(linha);
        }
        return modelo;
    }
}
