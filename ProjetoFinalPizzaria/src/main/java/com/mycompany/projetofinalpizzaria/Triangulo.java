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

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    private double lado;
    @Override
    public double calculaArea(){
        double area = ((Math.pow(this.lado, 2)) * (Math.sqrt(3)))/4;
        area =  Math.round(area * 100) / 100.0;
        return area;
    }
}
