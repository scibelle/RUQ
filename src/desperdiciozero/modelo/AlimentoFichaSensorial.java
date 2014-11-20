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
public class AlimentoFichaSensorial extends Alimento implements Serializable{
    
    /**
     * Contrutor padrão.
     */
    public AlimentoFichaSensorial(){}
    
    /**
     * COnstrutor com os dados necessários para o cadastro de um alimento da 
     * ficha sensorial.
     * @param nome
     * @param percapta 
     */
    public AlimentoFichaSensorial(String nome, double percapta){
        super(nome, percapta);
    }
}
