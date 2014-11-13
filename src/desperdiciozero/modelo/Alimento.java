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
public class Alimento {
    private String nome;
    private double percapta;
    private double temperatura;
    private double pesoReal;
    private double sobrasSujas;
    private double pesoRealSobrasSujas;
    private double porcoesReal;
    private double porcoesSobrasSujas;
    private Cuba recipiente;
    
    public Alimento(String nome, double percapta){
        this.nome = nome;
        this.percapta = percapta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setPercapta(double percapta){
        this.percapta = percapta;
    }
    public double getPercapta(){
        return this.percapta;
    }
    
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    public double getTemperatura(){
        return this.temperatura;
    }
    
    public void setPesoReal(double pesoReal){
        this.pesoReal = pesoReal;
    }
    public double getPesoReal(){
        return this.pesoReal;
    }
    
    public void setSobrasSujas(double sobrasSujas){
        this.sobrasSujas = sobrasSujas;
    }
    public double getSobrasSujas(){
        return this.sobrasSujas;
    }
    
    public void setPesoRealSobrasSujas(double pesoRealSobrasSujas){
        this.pesoRealSobrasSujas = pesoRealSobrasSujas;
    }
    public double getPesoRealSobrasSujas(){
        return this.pesoRealSobrasSujas;
    }
    
    public void setPorcoesReal(double porcoesReal){
        this.porcoesReal = porcoesReal;
    }
    public double getPorcoesReal(){
        return this.porcoesReal;
    }
    
    public void setPorcoesSobrasSujas(double porcoesSobrasSujas){
        this.porcoesSobrasSujas = porcoesSobrasSujas;
    }
    public double getPOrcoesSobrasSujas(){
        return this.porcoesSobrasSujas;
    }
    
    public void setRecipiente(Cuba recipiente){
        this.recipiente = recipiente;
    }
    public Cuba getRecipiente(){
        return this.recipiente;
    }
}
