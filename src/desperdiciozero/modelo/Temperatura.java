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
