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

    public TipoPizza(String categoria, double precoPorCentimentroQuadrado) throws Exception{
        String precoTeste = String.valueOf(precoPorCentimentroQuadrado);
        if(!precoTeste.matches("\\d+(\\.\\d{1,2})?")){
            throw new Exception("So permite ate dois numero de pois da virgula");
        }
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

    public void setPrecoPorCentimentroQuadrado(double precoPorCentimentroQuadrado)throws Exception {
        String precoTeste = String.valueOf(precoPorCentimentroQuadrado);
        if(!precoTeste.matches("\\d+(\\.\\d{1,2})?")){
            throw new Exception("So permite ate dois numero de pois da virgula");
        }
        this.precoPorCentimentroQuadrado = precoPorCentimentroQuadrado;
    }
    
    
}
