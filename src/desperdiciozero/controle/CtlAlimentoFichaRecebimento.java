/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Alimento;
import desperdiciozero.modelo.AlimentoFichaRecebimento;
import desperdiciozero.modelo.Cuba;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlAlimentoFichaRecebimento {
    
    public CtlAlimentoFichaRecebimento(){}
    
    public void cadastrarAlimentoFichaRecebimento(double pesoReal,
            double sobrasSujas, 
            double pesoRealSobrasSujas,
            double porcaoReal,
            double porcaoSobrasSujas,
            Cuba recipiente,
            AlimentoFichaRecebimento alimento){
        
        BDFake.bfAliemntoFichaRecebimento.add(new AlimentoFichaRecebimento(pesoReal,
                sobrasSujas, 
                pesoRealSobrasSujas, 
                porcaoReal, 
                porcaoSobrasSujas, 
                recipiente, 
                alimento));
    }
}
