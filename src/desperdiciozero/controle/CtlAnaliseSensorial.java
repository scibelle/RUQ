/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.AnaliseSensorial;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlAnaliseSensorial {
    
    public CtlAnaliseSensorial(){}
    
    public void cadastrarAnaliseSensorial(boolean sabor,
            boolean odor,
            boolean aparencia,
            boolean consistencia){
        
        BDFake.bfAnaliseSensorial.add(new AnaliseSensorial(sabor, 
                odor, 
                aparencia, 
                consistencia));
    }
}
