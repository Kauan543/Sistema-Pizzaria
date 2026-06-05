/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
public class Triangulo extends Forma{
    public Triangulo(){
        
    }
    public Triangulo(double lado) throws Exception{
        if(lado <20 || lado>60){
            throw new Exception("lado do triangulo deve ser no minimo 20 e no maximo 60");
        }
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) throws Exception{
        if(lado <20 || lado>60){
            throw new Exception("lado do triangulo deve ser no minimo 20 e no maximo 60");
        }
        this.lado = lado;
    }
    private double lado;
    @Override
    public double calculaArea(){
        double area = ((Math.pow(this.lado, 2)) * (Math.sqrt(3)))/4;
        area =  Math.round(area * 100) / 100.0;
        return area;
    }
    public double calcularLadoTriangulo(double area) {
         if (area < 100 || area>1600){
            throw new IllegalArgumentException("A área é no minimo 100 e no maximo 1600");
        }
        double resultado = Math.sqrt((4 * area) / Math.sqrt(3));
        return Math.round(resultado * 100.0) / 100.0;
    }
}
