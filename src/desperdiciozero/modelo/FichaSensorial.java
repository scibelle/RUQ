/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.time.LocalTime;
import java.util.ArrayList;

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
    private ArrayList<AlimentoFichaSensorial> listaDeAlimentos;
    
    public FichaSensorial(){
        listaDeAlimentos = new ArrayList<>();
    }
    
    public FichaSensorial(String cardapio,
            LocalTime horaDeEntrega, 
            LocalTime inicioDaDistribuicao,
            Funcionario funcionarioResponsavel,
            Tipo tipo,
            Funcionario responsavelPelaAvaliacao){
        
        this.listaDeAlimentos = new ArrayList<>();
        this.cardapio = cardapio;
        this.horaDeEntrega = horaDeEntrega;
        this.inicioDaDistribuicao = inicioDaDistribuicao;
        this.funcionarioResponsavel = funcionarioResponsavel;
        this.tipo = tipo;
        this.responsavelPelaAvaliacao = responsavelPelaAvaliacao;
        
    }
    
    public void addAlimentoFichaSensorial(AlimentoFichaSensorial alimento){
        this.listaDeAlimentos.add(alimento);
    }
    
    public ArrayList<AlimentoFichaSensorial> getListaDeAlimentos(){
        return this.listaDeAlimentos;
    }
    
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
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public Tipo getTipo(){
        return this.tipo;
    }
    
    @Override
    public String toString(){
        return "Cardápio: " + this.cardapio + "\n" +
                "Horário de entrega: " + this.horaDeEntrega.toString() + "\n" +
                "Início da distribuição: " + this.inicioDaDistribuicao.toString() + "\n" +
                funcionarioResponsavel.toString() + "\n" +
                "Tipo: " + this.tipo.toString() + "\n" +
                this.responsavelPelaAvaliacao.toString();
    }
}
