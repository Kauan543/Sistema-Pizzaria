/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
public class Sabor {
    private String sabor;
    private TipoPizza tipo;

    public Sabor(String sabor, TipoPizza tipo) throws Exception{
        if(!sabor.matches("[a-zA-Z]+")){
            throw new Exception("Sabor so permite letras");
        }
        this.sabor = sabor;
        this.tipo = tipo;
    }

    public TipoPizza getTipo() {
        return tipo;
    }

    public void setTipo(TipoPizza tipo) {
        this.tipo = tipo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor)throws Exception {
        if(!sabor.matches("[a-zA-Z]+")){
            throw new Exception("Sabor so permite letras");
        }
        this.sabor = sabor;
    }

    public Sabor(String sabor) {
        this.sabor = sabor;
    }
}
