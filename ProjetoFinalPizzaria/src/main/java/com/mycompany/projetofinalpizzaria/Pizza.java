package com.mycompany.projetofinalpizzaria;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kauan
 */
public class Pizza {
    private double area;
    private Forma forma;
    private ArrayList<Sabor> sabor ;

    public Pizza(double area, Forma forma, ArrayList<Sabor> sabor) {
        this.area = area;
        this.forma = forma;
        this.sabor = sabor;
    }
    
    

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public Forma getForma() {
        return forma;
    }

    public void setForma(Forma forma) {
        this.forma = forma;
    }

    public ArrayList<Sabor> getSabor() {
        return sabor;
    }

    public void setSabor(ArrayList<Sabor> sabor) {
        this.sabor = sabor;
    }
    
}
