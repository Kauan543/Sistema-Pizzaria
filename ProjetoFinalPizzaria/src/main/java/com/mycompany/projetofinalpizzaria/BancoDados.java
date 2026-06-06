/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

import java.util.ArrayList;

/**
 *
 * @author Kauan
 */
public class BancoDados {
    // Variável que guarda a unica instancia da classe
    private static BancoDados instanciaUnica;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Sabor> listaSabor;
    private ArrayList<TipoPizza> listaTipo;
    private ArrayList<Pedido> listaPedido;
    private ArrayList<Estado> listaEstado;

    public ArrayList<Pedido> getListaPedido() {
        return listaPedido;
    }

    public void setListaPedido(ArrayList<Pedido> listaPedido) {
        this.listaPedido = listaPedido;
    }

    public ArrayList<Estado> getListaEstado() {
        return listaEstado;
    }

    public void setListaEstado(ArrayList<Estado> listaEstado) {
        this.listaEstado = listaEstado;
    }
    // Construtor privado para impedir a instacia dessa classe por outras classes
    private BancoDados() {
        listaCliente = new ArrayList<>();
        listaSabor = new ArrayList<>();
        listaTipo = new ArrayList<>();
        listaEstado = new ArrayList<>();
        listaPedido = new ArrayList<>();
        try{
            listaTipo.add(new TipoPizza("Simples", 0));
            listaTipo.add(new TipoPizza("Especial", 0));
            listaTipo.add(new TipoPizza("Premium", 0));
            listaEstado.add(new Estado("Aberto"));
            listaEstado.add(new Estado("A caminho"));
            listaEstado.add(new Estado("Entregue"));
        }
        catch(Exception e){
            
        }
    }

    public ArrayList<Sabor> getListaSabor() {
        return listaSabor;
    }

    public void setListaSabor(ArrayList<Sabor> listaSabor) {
        this.listaSabor = listaSabor;
    }

    public ArrayList<TipoPizza> getListaTipo() {
        return listaTipo;
    }

    public void setListaTipo(ArrayList<TipoPizza> listaTipo) {
        this.listaTipo = listaTipo;
    }
    // Metods que retorno essa unica instancia
    public static BancoDados getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new BancoDados();
        }
        return instanciaUnica;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
}
