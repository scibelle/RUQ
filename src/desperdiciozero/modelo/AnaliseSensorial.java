/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

/**
 *
 * @author Gabriel Jorge
 */
public class AnaliseSensorial {
    private boolean sabor;
    private boolean odor;
    private boolean aparencia;
    private boolean consistencia;
    
    public AnaliseSensorial(){}
    
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
}
