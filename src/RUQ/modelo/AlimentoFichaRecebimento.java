/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.modelo;

import java.io.Serializable;

/**
 *
 * @author Gabriel Jorge
 */
public class AlimentoFichaRecebimento extends Alimento implements Serializable{
    private double pesoTotal;
    private double pesoReal;
    private double sobrasSujas;
    private double pesoRealSobrasSujas;
    private double porcoesReal;
    private double porcoesSobrasSujas;
    private Cuba recipiente;
    
    /** 
     * Construtor padrão.
     */
    public AlimentoFichaRecebimento(){}
    
    /** 
     * Construtor com todos os dados necessários para se cadastrar um aliemnto
     * da ficha de recebimento.
     * @param nome
     * @param percapta
     * @param pesoTotal
     * @param pesoReal
     * @param sobrasSujas
     * @param pesoRealSobrasSujas
     * @param porcaoReal
     * @param porcaoSobrasSujas
     * @param recipiente 
     */
    public AlimentoFichaRecebimento(String nome, double percapta, double pesoTotal, double pesoReal,
            double sobrasSujas, 
            double pesoRealSobrasSujas,
            double porcaoReal,
            double porcaoSobrasSujas,
            Cuba recipiente){
        
        super(nome, percapta);
        this.pesoTotal = pesoTotal;
        this.pesoReal = pesoReal;
        this.sobrasSujas = sobrasSujas;
        this.pesoRealSobrasSujas = pesoRealSobrasSujas;
        this.porcoesReal = porcaoReal;
        this.porcoesSobrasSujas = porcaoSobrasSujas;
        this.recipiente = recipiente;
    }
    
    //--------------------------------------------------------------------------
    //----------------------------Gets e sets-----------------------------------
    //--------------------------------------------------------------------------
    
    /**
     * Recebe como parâmetro o peso total de todas as cubas cheias de um tipo de 
     * alimento.
     * @param pesoTotal 
     */
    public void setPesoTotal(double pesoTotal){
        this.pesoTotal = pesoTotal;
    }
    /**
     * 
     * @return Retorna o peso total de todas as cubas cheias de um tipo de 
     * alimento.
     */
    public double getPesoTotal(){
        return this.pesoTotal;
    }
    
    /**
     * Recebe como parâmetro o peso real de um alimento. O peso real corresponde 
     * ao peso total de um alimento discontado do peso das cubas.
     * @param pesoReal 
     */
    public void setPesoReal(double pesoReal){
        this.pesoReal = pesoReal;
    }
    /**
     * 
     * @return Retorna o peso real de um alimento.
     */
    public double getPesoReal(){
        return this.pesoReal;
    }
    
    /**
     * Recebe como parâmetro o peso das sobras sujas juntamente com o peso de 
     * sua cuba.
     * @param sobrasSujas 
     */
    public void setSobrasSujas(double sobrasSujas){
        this.sobrasSujas = sobrasSujas;
    }
    /**
     * 
     * @return Retorna o peso de uma sobras sujas juntamente com o peso da cuba.
     */
    public double getSobrasSujas(){
        return this.sobrasSujas;
    }
    /**
     * Recebe como parâmetro o peso real das sobras sujas.
     * @param pesoRealSobrasSujas 
     */
    public void setPesoRealSobrasSujas(double pesoRealSobrasSujas){
        this.pesoRealSobrasSujas = pesoRealSobrasSujas;
    }
    /**
     * 
     * @return Retorna o peso real das sobras sujas. 
     */
    public double getPesoRealSobrasSujas(){
        return this.pesoRealSobrasSujas;
    }
    
    /**
     * Recebe como parâmetro a quantidade de porções de um alimento.
     * @param porcoesReal 
     */
    public void setPorcoesReal(double porcoesReal){
        this.porcoesReal = porcoesReal;
    }
    /**
     * 
     * @return Retorna a quantidade de porções de um alimento
     */
    public double getPorcoesReal(){
        return this.porcoesReal;
    }
    
    /**
     * Recebe como parâmetro a quantidade de porções das sobras sujas.
     * @param porcoesSobrasSujas 
     */
    public void setPorcoesSobrasSujas(double porcoesSobrasSujas){
        this.porcoesSobrasSujas = porcoesSobrasSujas;
    }
    /**
     * 
     * @return Retorna a quantidade de porções das sobras sujas.
     */
    public double getPOrcoesSobrasSujas(){
        return this.porcoesSobrasSujas;
    }
    
    /**
     * Recebe como parâmetro o tipo de recipiente do alimento.
     * @param recipiente 
     */
    public void setRecipiente(Cuba recipiente){
        this.recipiente = recipiente;
    }
    /**
     * Retorna o tipo de recipiente do alimento.
     * @return 
     */
    public Cuba getRecipiente(){
        return this.recipiente;
    }
}
