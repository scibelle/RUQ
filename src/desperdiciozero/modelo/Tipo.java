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
public enum Tipo implements Serializable{
    ALMOCO(0), JANTAR(1);
    
    private int VAL;
    
    private Tipo(int val){
        this.VAL = val;
    }
    
    @Override
    public String toString(){
        if(VAL == 0)
            return "Almoço";
        else
            return "Jantar";
    }
}
