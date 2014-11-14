/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Cuba;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlCuba {
    
    public CtlCuba(){}
    
    public void cadastrarCuba(String nome, double peso){
        BDFake.bfCuba.add(new Cuba(nome, peso));
    }
}
