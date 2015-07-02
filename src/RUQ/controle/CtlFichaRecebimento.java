/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.controle;

import RUQ.modelo.AlimentoFichaRecebimento;
import RUQ.modelo.FichaRecebimento;
import RUQ.modelo.Tipo;
import java.time.LocalDate;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlFichaRecebimento {
    
    /**
     * Objeto que vai guardar a instância da nova ficha criada. Isso é necessário 
     * pois o relacionamento entre ficha de recebimento e alimento da ficha de 
     * recebimento é um para vários, o que faz com que a instância de um tenha uma 
     * lista com os vários. Assim, é necessária uma referência como propriedade 
     * para se ter o poder de manipular a instância de um corretamente e conssequentemente
     * poder adicioanr mais vários a ela.
     */
    private FichaRecebimento fichaRecebimento;
    
    public CtlFichaRecebimento(){}
    
    public void cadastrarFichaRecebimento(LocalDate data,
            String semana,
            Tipo tipo,
            double rejeito,
            boolean autorizado,
            double totalRefeicoes){
        
        fichaRecebimento = new FichaRecebimento(data, 
                semana, 
                tipo, 
                rejeito, 
                autorizado, 
                totalRefeicoes);
        
        //BDFake.bfFichaRecebimento.add(fichaRecebimento);
                
    }
    
     public void addAlimentoFichaRecebimento(AlimentoFichaRecebimento alimento){

       // TODO: Ajeitar a ficha de recebimento (olhar ficha sensorial para referencia
       // fichaRecebimento.getListaDeAlimentos().add(alimento);

    }
     
    public boolean temFicha(){
        return fichaRecebimento != null;
    }
    
    public void limparFicha() throws Exception{
        fichaRecebimento = null;
    }
}
