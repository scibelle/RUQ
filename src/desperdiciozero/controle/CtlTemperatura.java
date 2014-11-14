/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.AlimentoFicha;
import desperdiciozero.modelo.Temperatura;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlTemperatura {
    
    public CtlTemperatura(){}
    
    public void cadastrarTemperatura(ArrayList<AlimentoFicha> opc1,
            ArrayList<AlimentoFicha> opc2, 
            String ocorrencias){
        
        BDFake.bfTemperatura.add(new Temperatura(opc1, opc2, ocorrencias));
    }
}
