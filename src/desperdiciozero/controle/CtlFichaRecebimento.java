/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.AlimentoFichaRecebimento;
import desperdiciozero.modelo.FichaRecebimento;
import desperdiciozero.modelo.Tipo;
import java.time.LocalDate;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlFichaRecebimento {
    
    private FichaRecebimento fichaRecebimento;
    
    public CtlFichaRecebimento(){}
    
    public void cadastrarFichaRecebimento(LocalDate data,
            String semana,
            Tipo tipo,
            double rejeito,
            boolean autorizado,
            double totalRefeicoes,
            AlimentoFichaRecebimento alimentoFicha){
        
        BDFake.bfFichaRecebimento.add(new FichaRecebimento(data, 
                semana, 
                tipo, 
                rejeito, 
                autorizado, 
                totalRefeicoes, 
                alimentoFicha));
                
    }
    
     public void addAlimentoFichaRecebimento(AlimentoFichaRecebimento alimento){
        // TODO: Ajeitar a ficha de recebimento (olhar ficha sensorial para referencia
        fichaRecebimento.getListaDeAlimentos().add(alimento);
    }
}
