/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

/**
 *
 * @author Acer
 */
public class Cuba {
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
}
