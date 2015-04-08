/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.controle;

import RUQ.controle.bancofake.BDFake;
import RUQ.modelo.Tickets;

/**
 *
 * @author 
 */
public class CtlTickets {
    
    public CtlTickets(){}
    
    public void cadastrarTotalDeTickets(int estudantes, int professores, int residentes, int funcionarios){
        BDFake.bfTickets.add(new Tickets(estudantes, professores, residentes, funcionarios));
    }
}
