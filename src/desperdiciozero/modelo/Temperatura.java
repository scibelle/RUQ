/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.util.ArrayList;

/**
 *
 * @author Gabriel jorge
 */
public class Temperatura {
    private ArrayList<AlimentoFicha> opc1;
    private ArrayList<AlimentoFicha> opc2;
    private String ocorrencias;
    
    public Temperatura(){}
    
    public Temperatura(AlimentoFicha alimentoFichaOpc1,
            AlimentoFicha alimentoFichaOpc2, 
            String ocorrencias){
    
        this.opc1 = new ArrayList<>();
        this.opc2 = new ArrayList<>();
        this.opc1.add(alimentoFichaOpc1);
        this.opc2.add(alimentoFichaOpc2);
        this.ocorrencias = ocorrencias;
    }
    
    public Temperatura(ArrayList<AlimentoFicha> opc1, 
            ArrayList<AlimentoFicha> opc2,
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
    
    public void addAlimentoFichaOpc1(AlimentoFicha alimentoFicha){
        this.opc1.add(alimentoFicha);
    }
    public AlimentoFicha getAlimentoFichaOpc1(int index){
        return this.opc1.get(index);
    }
    
    public void addAlimentoFichaOpc2(AlimentoFicha alimentoFicha){
        this.opc2.add(alimentoFicha);
    }
    public AlimentoFicha getAlimentoFicha(int index){
        return this.opc2.get(index);
    }
    
    public ArrayList<AlimentoFicha> getTemperaturasOPC1(){
        return this.opc1;
    }
    public ArrayList<AlimentoFicha> getTemperaturasOPC2(){
        return this.opc2;
    }
    
    public void setOcorrencias(String ocorrencias){
        this.ocorrencias = ocorrencias;
    }
    public String getOcorrencias(){
        return this.ocorrencias;
    }
}
