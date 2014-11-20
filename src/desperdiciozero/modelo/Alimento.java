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
public class Alimento implements Serializable{
    private String nome;
    private double percapta;
    private double temperatura;
    
    /**
     * Construtor padrão.
     */
    public Alimento(){}
    
    /**
     * COnstrutor que recebe todos os dados para se cadastrar um aliemnto 
     * qualquer.
     * @param nome
     * @param percapta 
     */
    public Alimento(String nome, double percapta){
        this.nome = nome;
        this.percapta = percapta;
    }
    
    //--------------------------------------------------------------------------
    //----------------------------Gets e sets-----------------------------------
    //--------------------------------------------------------------------------
    
    /**
     * Recebe um parâmetro String que será o nome do alimento.
     * @param nome 
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    /**
     * 
     * @return Retorna um String com o nome de um objeto da classe alimento.
     */
    public String getNome(){
        return this.nome;
    }
    
    /**
     * Recebe como parâmetro o valor da percapta de um alimento. Percapta é o 
     * valor médio que uma pessoa consome de um alimento.
     * @param percapta 
     */
    public void setPercapta(double percapta){
        this.percapta = percapta;
    }
    /**
     * 
     * @return Retorna o valor de uma percapta de um alimento.
     */
    public double getPercapta(){
        return this.percapta;
    }
    
    /**
     * Recebe como parâmetro o valor da temperatura de uma alimento.
     * @param temperatura 
     */
     public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    /**
     * 
     * @return Retorna a temperatura de um alimento.
     */
    public double getTemperatura(){
        return this.temperatura;
    }
    
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " -- Percapta: " + this.percapta;
    }
}
