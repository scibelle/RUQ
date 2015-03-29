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
public class AnaliseSensorial implements Serializable{
    private boolean sabor;
    private boolean odor;
    private boolean aparencia;
    private boolean consistencia;
    
    /**
     * Construtor padrão.
     */
    public AnaliseSensorial(){}
    
    /**
     * Construtor que recebe os dados necessários para o cadastro de analise 
     * sensorial.
     * @param sabor
     * @param odor
     * @param aparencia
     * @param consistencia 
     */
    public AnaliseSensorial(boolean sabor,
            boolean odor,
            boolean aparencia,
            boolean consistencia){
        
        this.sabor = sabor;
        this.odor = odor;
        this.aparencia = aparencia;
        this.consistencia = consistencia;
    }
    
    //--------------------------------------------------------------------------
    //----------------------------Gets e sets-----------------------------------
    //--------------------------------------------------------------------------
    
    public void setSabor(boolean avaliacao){
        this.sabor = avaliacao;
    }
    public boolean getSabor(){
        return this.sabor;
    }
    
    public void setOdor(boolean avaliacao){
        this.odor = avaliacao;
    }
    public boolean getOdor(){
        return this.odor;
    }
    
    public void setAparencia(boolean avaliacao){
        this.aparencia = avaliacao;
    }
    public boolean getAparencia(){
        return this.aparencia;
    }
    
    public void setConsistencia(boolean avaliacao){
        this.consistencia = avaliacao;
    }
    public boolean getConsistencia(){
        return this.consistencia;
    }
    
    @Override
    public String toString(){
        return "Sabor: " + (this.sabor ? "Aprovado" : "Reprovado")+ "\n"+
                "Odor: " + (this.odor ? "Aprovado" : "Reprovado")+ "\n"+
                "Aparência: " + (this.consistencia ? "Aprovado" : "Reprovado")+ "\n"+
                "Consistência: " + (this.consistencia ? "Aprovado" : "Reprovado");
    }
}
