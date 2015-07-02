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
    //
    private String horaDeEntrega;
    private String dataEntrega;
    private String dataDistribuicao;
    private String horaDistribuicao;
    //
    private String inicioDaDistribuicao;
    private Funcionario Responsavel;
    private Tipo tipo;
    //1 verdadeiro e 0 falso
    private int saborAprovado;
    private int odorAprovado;
    private int aparenciaAprovada;
    private int consistenciaAprovada;
    //
    private ArrayList<Alimento> listaDeAlimentos;
    private String observacao;
    
    
    
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
            String horaDeEntrega, 
            String inicioDaDistribuicao,
            Tipo tipo,
            Funcionario responsavelPelaAvaliacao){
        
        this.listaDeAlimentos = new ArrayList<>();
        this.cardapio = cardapio;
        this.horaDeEntrega = horaDeEntrega;
        this.inicioDaDistribuicao = inicioDaDistribuicao;
        this.Responsavel = responsavelPelaAvaliacao;
        this.tipo = tipo;
        
    }
       
    //--------------------------------------------------------------------------
    //----------------------------Gets e sets-----------------------------------
    //--------------------------------------------------------------------------
    
    /** 
     * 
     * @return Um ArrayList com todos os alimentos de uma ficha sensorial.
     */
    public ArrayList<Alimento> getListaDeAlimentos(){
        return this.listaDeAlimentos;
    }
    
    
    
    public String listarAlimentos(){
        String retorno = "";
        for(Alimento alim : getListaDeAlimentos()){
            retorno += alim.toString()+ "\n";
        }
        return retorno;
    }
    
    @Override
    public String toString(){
        return "Cardápio: " + this.getCardapio() + "\n" +
                "Horário de entrega: " + this.getHoraDeEntrega().toString() + "\n" +
                "Início da distribuição: " + this.getInicioDaDistribuicao().toString() + "\n" +
                getResponsavel().toString() + "\n" +
                "Tipo: " + this.getTipo().toString() + "\n" +
                "\nAlimentos: " + listarAlimentos();
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the cardapio
     */
    public String getCardapio() {
        return cardapio;
    }

    /**
     * @param cardapio the cardapio to set
     */
    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    /**
     * @return the horaDeEntrega
     */
    public String getHoraDeEntrega() {
        return horaDeEntrega;
    }

    /**
     * @param horaDeEntrega the horaDeEntrega to set
     */
    public void setHoraDeEntrega(String horaDeEntrega) {
        this.horaDeEntrega = horaDeEntrega;
    }

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    /**
     * @return the dataDistribuicao
     */
    public String getDataDistribuicao() {
        return dataDistribuicao;
    }

    /**
     * @param dataDistribuicao the dataDistribuicao to set
     */
    public void setDataDistribuicao(String dataDistribuicao) {
        this.dataDistribuicao = dataDistribuicao;
    }

    /**
     * @return the horaDistribuicao
     */
    public String getHoraDistribuicao() {
        return horaDistribuicao;
    }

    /**
     * @param horaDistribuicao the horaDistribuicao to set
     */
    public void setHoraDistribuicao(String horaDistribuicao) {
        this.horaDistribuicao = horaDistribuicao;
    }

    /**
     * @return the inicioDaDistribuicao
     */
    public String getInicioDaDistribuicao() {
        return inicioDaDistribuicao;
    }

    /**
     * @param inicioDaDistribuicao the inicioDaDistribuicao to set
     */
    public void setInicioDaDistribuicao(String inicioDaDistribuicao) {
        this.inicioDaDistribuicao = inicioDaDistribuicao;
    }

    /**
     * @return the Responsavel
     */
    public Funcionario getResponsavel() {
        return Responsavel;
    }

    /**
     * @param Responsavel the Responsavel to set
     */
    public void setResponsavel(Funcionario Responsavel) {
        this.Responsavel = Responsavel;
    }

    /**
     * @return the tipo
     */
    public Tipo getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the saborAprovado
     */
    public int getSaborAprovado() {
        return saborAprovado;
    }

    /**
     * @param saborAprovado the saborAprovado to set
     */
    public void setSaborAprovado(int saborAprovado) {
        this.saborAprovado = saborAprovado;
    }

    /**
     * @return the odorAprovado
     */
    public int getOdorAprovado() {
        return odorAprovado;
    }

    /**
     * @param odorAprovado the odorAprovado to set
     */
    public void setOdorAprovado(int odorAprovado) {
        this.odorAprovado = odorAprovado;
    }

    /**
     * @return the aparenciaAprovada
     */
    public int getAparenciaAprovada() {
        return aparenciaAprovada;
    }

    /**
     * @param aparenciaAprovada the aparenciaAprovada to set
     */
    public void setAparenciaAprovada(int aparenciaAprovada) {
        this.aparenciaAprovada = aparenciaAprovada;
    }

    /**
     * @return the consistenciaAprovada
     */
    public int getConsistenciaAprovada() {
        return consistenciaAprovada;
    }

    /**
     * @param consistenciaAprovada the consistenciaAprovada to set
     */
    public void setConsistenciaAprovada(int consistenciaAprovada) {
        this.consistenciaAprovada = consistenciaAprovada;
    }

    /**
     * @param listaDeAlimentos the listaDeAlimentos to set
     */
    public void setListaDeAlimentos(ArrayList<Alimento> listaDeAlimentos) {
        this.listaDeAlimentos = listaDeAlimentos;
    }
}
