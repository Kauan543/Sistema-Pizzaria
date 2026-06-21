/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
public class Quadrado extends Forma {
    private double lado;
    //para nao da erro nos testes antigos
    public Quadrado(){
        
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado)throws Exception {
        if(lado<10 || lado>40){
            //lança exceção quando ultrapassar o limite da medida
            throw new Exception("lado do quadrado deve ser no minimo 10 e no maximo 40");
        }
        this.lado = lado;
    }

    public Quadrado(double lado) throws Exception{
        if(lado<10 || lado>40){
            //lança exceção quando ultrapassar o limite da medida
            throw new Exception("lado do quadrado deve ser no minimo 10 e no maximo 40");
        }
        this.lado = lado;
    }
    @Override
    public double calculaArea(){
        return this.lado * this.lado;
    }
    public double calcularLadoQuadrado(double area) {
        if (area < 100 || area>1600){
            //lança exceção quando ultrapassar o limite da area
            throw new IllegalArgumentException("A área é no minimo 100 e no maximo 1600");
        }
        double resultado = Math.sqrt(area);
        return Math.round(resultado * 100.0) / 100.0;
    }
}
