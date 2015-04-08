/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.controle;

import RUQ.controle.bancofake.BDFake;
import RUQ.modelo.AlimentoFichaSensorial;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlAlimentoFichaAnaliseSensorial {
    
    public CtlAlimentoFichaAnaliseSensorial(){}
    
    public void cadastrarAlimentoFichaSensorial(String nome, double percapta){
        BDFake.bfAlimentoFichaSensorial.add(new AlimentoFichaSensorial(nome, percapta));
    }
}
