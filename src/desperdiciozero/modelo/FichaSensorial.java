/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.time.LocalTime;

/**
 *
 * @author Gabriel Jorge
 */
public class FichaSensorial {
    private String cardapio;
    private LocalTime horaDeEntrega;
    private LocalTime inicioDaDistribuicao;
    private Funcionario funcionarioResponsavel;
    private Tipo tipo;
    private Funcionario responsavelPelaAvaliacao;
    
    public FichaSensorial(){}
    
    public void setCardapio(String cardapio){
        this.cardapio = cardapio;
    }
    public String getCardapio(){
        return this.cardapio;
    }
    
    public void setHorarioDeEntrega(LocalTime horaDeEntrega){
        this.horaDeEntrega = horaDeEntrega;
    }
    public LocalTime getHorarioDeEntrega(){
        return this.horaDeEntrega;
    }
    
    public void setInicioDaDistribuicao(LocalTime inicioDaDistribuicao){
        this.inicioDaDistribuicao = inicioDaDistribuicao;
    }
    public LocalTime getInicioDaDistribuicao(){
        return this.inicioDaDistribuicao;
    }
    
    public void setFuncionarioResponsavel(Funcionario responsavel){
        this.funcionarioResponsavel = responsavel;
    }
    public Funcionario getFuncionarioResponsavel(){
        return this.funcionarioResponsavel;
    }
    
    public void setResponsavelPelaAvaliacao(Funcionario responsavel){
        this.responsavelPelaAvaliacao = responsavel;
    }
    public Funcionario getResponsavelPelaAvaliacao(){
        return this.responsavelPelaAvaliacao;
    }
}
