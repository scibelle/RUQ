/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.AlimentoFichaSensorial;
import desperdiciozero.modelo.FichaSensorial;
import desperdiciozero.modelo.Funcionario;
import desperdiciozero.modelo.Tipo;
import java.time.LocalTime;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlFichaSensorial {
    
    private FichaSensorial fichaSensorial;
    
    public CtlFichaSensorial(){}
    
    public void cadastrarFichaSensorial(String cardapio, 
            LocalTime horaDeEntrega, 
            LocalTime inicioDaDistribuicao,
            Funcionario funcionarioResponsavel,
            Tipo tipo,
            Funcionario responsavelPelaAvaliacao){
        
        fichaSensorial = new FichaSensorial(cardapio, 
                horaDeEntrega, 
                inicioDaDistribuicao, 
                funcionarioResponsavel, 
                tipo, 
                responsavelPelaAvaliacao);
                
        
        BDFake.bfFichaSensorial.add(fichaSensorial);
    }
    
    
     public void addAlimentoFichaSensorial(AlimentoFichaSensorial alimento){
        fichaSensorial.getListaDeAlimentos().add(alimento);
    }
    
    public void seTemperaturaAlimentoFichaSensorial(int index, double temperatura){
        fichaSensorial.getListaDeAlimentos().get(index).setTemperatura(temperatura);
    }
    
    // ssisaias - metodos auxiliares
    public boolean temFicha(){
        return fichaSensorial != null;
    }
    
    public void limparFicha() throws Exception{
        fichaSensorial = null;
    }
}
