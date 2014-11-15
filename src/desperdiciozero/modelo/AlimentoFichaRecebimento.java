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
public class AlimentoFichaRecebimento extends Alimento{
    private double pesoReal;
    private double sobrasSujas;
    private double pesoRealSobrasSujas;
    private double porcoesReal;
    private double porcoesSobrasSujas;
    private Cuba recipiente;
    private AlimentoFichaRecebimento alimento;
    
    public AlimentoFichaRecebimento(){}
    
    public AlimentoFichaRecebimento(double pesoReal,
            double sobrasSujas, 
            double pesoRealSobrasSujas,
            double porcaoReal,
            double porcaoSobrasSujas,
            Cuba recipiente,
            AlimentoFichaRecebimento alimento){
        
        this.pesoReal = pesoReal;
        this.sobrasSujas = sobrasSujas;
        this.pesoRealSobrasSujas = pesoRealSobrasSujas;
        this.porcoesReal = porcaoReal;
        this.porcoesSobrasSujas = porcaoSobrasSujas;
        this.recipiente = recipiente;
        this.alimento = alimento;
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
    
    public void setAlimento(AlimentoFichaRecebimento alimento){
        this.alimento = alimento;
    }
    public AlimentoFichaRecebimento getAlimento(){
        return this.alimento;
    }
}
