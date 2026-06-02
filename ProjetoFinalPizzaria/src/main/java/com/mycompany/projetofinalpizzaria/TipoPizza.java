/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
class TipoPizza {
    private String categoria;
    private double precoPorCentimentroQuadrado;

    public TipoPizza(String categoria, double precoPorCentimentroQuadrado) {
        this.categoria = categoria;
        this.precoPorCentimentroQuadrado = precoPorCentimentroQuadrado;
    }
    

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecoPorCentimentroQuadrado() {
        return precoPorCentimentroQuadrado;
    }

    public void setPrecoPorCentimentroQuadrado(double precoPorCentimentroQuadrado) {
        this.precoPorCentimentroQuadrado = precoPorCentimentroQuadrado;
    }
    
    
}
