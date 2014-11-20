/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.io.Serializable;

/**
 *
 * @author Gabriel Jorge
 */
public class Cuba implements Serializable{
    private String nome;
    private double peso;
    
    public Cuba(String nome, double peso){
        this.nome = nome;
        this.peso = peso;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return this.peso;
    }
    
    @Override
    public String toString(){
        return "Cuba: " + this.nome +" -- Peso: " + this.peso;
    }
}
