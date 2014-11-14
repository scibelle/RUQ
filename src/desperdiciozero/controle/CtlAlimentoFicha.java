/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Alimento;
import desperdiciozero.modelo.AlimentoFicha;
import desperdiciozero.modelo.Cuba;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlAlimentoFicha {
    
    public CtlAlimentoFicha(){}
    
    public void cadastrarAlimentoFicha(double pesoReal, 
            double temperatura, 
            double sobrasSujas, 
            double pesoRealSobrasSujas,
            double porcaoReal,
            double porcaoSobrasSujas,
            Cuba recipiente,
            Alimento alimento){
        
        BDFake.bfAliemntoFicha.add(new AlimentoFicha(pesoReal, 
                temperatura, 
                sobrasSujas, 
                pesoRealSobrasSujas, 
                porcaoReal, 
                porcaoSobrasSujas, 
                recipiente, 
                alimento));
    }
}
