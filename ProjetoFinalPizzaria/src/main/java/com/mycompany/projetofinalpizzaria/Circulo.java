/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
public class Circulo extends Forma {
    private double raio;
    
    public Circulo(){
        
    }
    public Circulo(double raio) throws Exception{
        if(raio<7 || raio>23){
            throw new Exception("O raio deve ser no minimo 7 e no maximo 23");
        }
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) throws Exception {
        if(raio<7 || raio>23){
            throw new Exception("O raio deve ser no minimo 7 e no maximo 23");
        }
        this.raio = raio;
    }
    @Override
    public double calculaArea(){
        double area = Math.PI * Math.pow(this.raio, 2);
        return Math.round(area * 100) / 100.0;
    }
    public double calcularRaioCirculo(double area) {
         if (area < 100 || area>1600){
            throw new IllegalArgumentException("A área é no minimo 100 e no maximo 1600");
        }
        double resultado = Math.sqrt(area / Math.PI);
        return Math.round(resultado * 100.0) / 100.0;
    }
}
