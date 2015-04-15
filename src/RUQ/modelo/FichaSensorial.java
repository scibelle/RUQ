/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.modelo;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Jorge
 */
public class FichaSensorial implements Serializable{
    //14Abr2015 - Atualizar esse Model - Checar o banco dzero.db
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
    
    /**
     * Contrutor que recebe todos os dados necessários para o cadastro de uma 
     * ficha sensorial.
     * @param cardapio
     * @param horaDeEntrega
     * @param inicioDaDistribuicao
     * @param funcionarioResponsavel
     * @param tipo
     * @param responsavelPelaAvaliacao 
     */
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
       
    //--------------------------------------------------------------------------
    //----------------------------Gets e sets-----------------------------------
    //--------------------------------------------------------------------------
    
    /** 
     * 
     * @return Um ArrayList com todos os alimentos de uma ficha sensorial.
     */
    public ArrayList<AlimentoFichaSensorial> getListaDeAlimentos(){
        return this.listaDeAlimentos;
    }
    
    /**
     * Recebe uma String com o cardápio do recebimento.
     * @param cardapio 
     */
    public void setCardapio(String cardapio){
        this.cardapio = cardapio;
    }
    /**
     * 
     * @return Retorna uma String com o cardápio de um recebimento.
     */
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
    
    public String listarAlimentos(){
        String retorno = "";
        for(AlimentoFichaSensorial alim : listaDeAlimentos){
            retorno += alim.toString()+ "\n";
        }
        return retorno;
    }
    
    @Override
    public String toString(){
        return "Cardápio: " + this.cardapio + "\n" +
                "Horário de entrega: " + this.horaDeEntrega.toString() + "\n" +
                "Início da distribuição: " + this.inicioDaDistribuicao.toString() + "\n" +
                funcionarioResponsavel.toString() + "\n" +
                "Tipo: " + this.tipo.toString() + "\n" +
                this.responsavelPelaAvaliacao.toString() +
                "\nAlimentos: " + listarAlimentos();
    }
}
