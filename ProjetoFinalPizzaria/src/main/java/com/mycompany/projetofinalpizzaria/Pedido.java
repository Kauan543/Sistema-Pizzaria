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
public class Pedido {
    private int idPedido;
    private double precoTotal;
    private ArrayList<Pizza>pizza;
    private Estado estado;
    private Cliente cliente;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //construtor
    public Pedido(int idPedido, double precoTotal, ArrayList<Pizza> pizza, Estado estado, Cliente cliente) {
        this.idPedido = idPedido;
        this.precoTotal = precoTotal;
        this.pizza = pizza;
        this.estado = estado;
        this.cliente = cliente;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public ArrayList<Pizza> getPizza() {
        return pizza;
    }

    public void setPizza(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
