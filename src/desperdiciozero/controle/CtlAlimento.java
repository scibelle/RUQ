/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Alimento;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlAlimento {
    
    public CtlAlimento(){}
    
    public void cadastrarAlimento(String nome, double percapta){
        BDFake.bfAlimento.add(new Alimento(nome, percapta));
    }
}
