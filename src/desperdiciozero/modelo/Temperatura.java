/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gabriel jorge
 */
public class Temperatura implements Serializable{
    private ArrayList<AlimentoFichaRecebimento> opc1;
    private ArrayList<AlimentoFichaRecebimento> opc2;
    private String ocorrencias;
    
    public Temperatura(){}
    
    public Temperatura(AlimentoFichaRecebimento alimentoFichaOpc1,
            AlimentoFichaRecebimento alimentoFichaOpc2, 
            String ocorrencias){
    
        this.opc1 = new ArrayList<>();
        this.opc2 = new ArrayList<>();
        this.opc1.add(alimentoFichaOpc1);
        this.opc2.add(alimentoFichaOpc2);
        this.ocorrencias = ocorrencias;
    }
    
    public Temperatura(ArrayList<AlimentoFichaRecebimento> opc1, 
            ArrayList<AlimentoFichaRecebimento> opc2,
            String ocorrencias){
        
        this.opc1 = opc1;
        this.opc2 = opc2;
        this.ocorrencias = ocorrencias;
    }
    
    public void setTemperaturaAlimentoFichaOpc1(int index, double temperatura){
        this.opc1.get(index).setTemperatura(temperatura);
    }
    public double getTemperaturaAlimentoFichaOpc1(int index){
        return this.opc1.get(index).getTemperatura();
    }
    
    public void setTemperaturaAlimentoFichaOpc2(int index, double temperatura){
        this.opc2.get(index).setTemperatura(temperatura);
    }
    public double getTemperaturaAlimentoFichaOpc2(int index){
        return this.opc2.get(index).getTemperatura();
    }
    
    public void addAlimentoFichaOpc1(AlimentoFichaRecebimento alimentoFicha){
        this.opc1.add(alimentoFicha);
    }
    public AlimentoFichaRecebimento getAlimentoFichaOpc1(int index){
        return this.opc1.get(index);
    }
    
    public void addAlimentoFichaOpc2(AlimentoFichaRecebimento alimentoFicha){
        this.opc2.add(alimentoFicha);
    }
    public AlimentoFichaRecebimento getAlimentoFicha(int index){
        return this.opc2.get(index);
    }
    
    public ArrayList<AlimentoFichaRecebimento> getTemperaturasOPC1(){
        return this.opc1;
    }
    public ArrayList<AlimentoFichaRecebimento> getTemperaturasOPC2(){
        return this.opc2;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias = ocorrencias;
    }
    public String getOcorrencias(){
        return this.ocorrencias;
    }
}
