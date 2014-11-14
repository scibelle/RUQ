/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.FichaSensorial;
import desperdiciozero.modelo.Funcionario;
import desperdiciozero.modelo.Tipo;
import java.time.LocalTime;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlFichaSensorial {
    
    public CtlFichaSensorial(){}
    
    public void cadastrarFichaSensorial(String cardapio, 
            LocalTime horaDeEntrega, 
            LocalTime inicioDaDistribuicao,
            Funcionario funcionarioResponsavel,
            Tipo tipo,
            Funcionario responsavelPelaAvaliacao){
        
        BDFake.bfFichaSensorial.add(new FichaSensorial(cardapio, 
                horaDeEntrega, 
                inicioDaDistribuicao, 
                funcionarioResponsavel, 
                tipo, 
                responsavelPelaAvaliacao));
    }
}
