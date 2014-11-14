/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle;

import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Funcionario;

/**
 *
 * @author Gabriel Jorge
 */
public class CtlFuncionario {
    
    public CtlFuncionario(){}
    
    public void cadastrarFuncionario(String nome){
        BDFake.bfFuncionario.add(new Funcionario(nome));
    }
}
