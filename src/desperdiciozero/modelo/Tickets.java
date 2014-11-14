/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

/**
 *
 * @author Gabriel Jorge
 */
public class Tickets {
    private int estudantes;
    private int professores;
    private int residentes;
    private int funcionarios;
    
    public Tickets(){}
    
    public void setTotalProfessores(int total){
        this.professores = total;
    }
    public int getTotalProfessores(){
        return this.professores;
    }
    
    public void setTotalEstudantes(int total){
        this.estudantes = total;
    }
    public int getTotalEstudantes(){
        return this.estudantes;
    }
    
    public void setTotalResidentes(int total){
        this.residentes = total;
    }
    public int getTotalResidentes(){
        return this.residentes;
    }
    
    public void setTotalFuncionario(int total){
        this.funcionarios = total;
    }
    public int getTotalFuncionarios(){
        return this.funcionarios;
    }
}
