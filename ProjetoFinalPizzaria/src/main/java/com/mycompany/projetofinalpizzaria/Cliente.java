/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetofinalpizzaria;

/**
 *
 * @author Kauan
 */
public class Cliente {
    private String nome;
    private String sobrenome;
    private String telefone;

    public Cliente(String nome, String sobrenome, String telefone) {
        if(!telefone.matches("\\d{10,11}")){
            throw new IllegalArgumentException("Telefone deve conter apenas numero e ter no minimo 10 e no maximo 11 caracteres");
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if(telefone.matches("\\d{10,11}")){
            this.telefone = telefone;
        }
        else{
            throw new IllegalArgumentException("Telefone deve conter apenas numero e ter no minimo 10 e no maximo 11 caracteres");
        }
        
    }
    
}
