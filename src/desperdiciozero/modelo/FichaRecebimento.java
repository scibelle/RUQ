/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Jorge
 */
public class FichaRecebimento {
    private LocalDate data;
    private String semana;
    private Tipo tipo;
    private double rejeito;
    private boolean autorizado;
    private double totalRefeicoes;
    private ArrayList<AlimentoFicha> listaDeAlimentos;
    
    public FichaRecebimento(AlimentoFicha alimentoFicha){
        this.listaDeAlimentos = new ArrayList<>();
        this.listaDeAlimentos.add(alimentoFicha);
    }
    
    public FichaRecebimento(LocalDate data,
            String semana,
            Tipo tipo,
            double rejeito,
            boolean autorizado,
            double totalRefeicoes,
            AlimentoFicha alimentoFicha){
        
        this.listaDeAlimentos = new ArrayList<>();
        this.listaDeAlimentos.add(alimentoFicha);
        this.data = data;
        this.semana = semana;
        this.tipo = tipo;
        this.rejeito = rejeito;
        this.autorizado = autorizado;
        this.totalRefeicoes = totalRefeicoes;
    }
    
    public void setData(LocalDate data){
        this.data = data;
    }
    public LocalDate getData(){
        return this.data;
    }
    
    public void setSemana(String semana){
        this.semana = semana;
    }
    public String getSemana(){
        return this.semana;
    }
    
    public void setTipo(Tipo tipo){
        this.tipo = tipo;
    }
    public Tipo getTipo(){
        return this.tipo;
    }
    
    public void setRejeito(double rejeito){
        this.rejeito = rejeito;
    }
    public double getRejeito(){
        return this.rejeito;
    }
    
    public void setAutorizacao(boolean autorizacao){
        this.autorizado = autorizacao;
    }
    public boolean getAutorizacao(){
        return this.autorizado;
    }
    
    public void setTotalDeRefeicoes(double total){
        this.totalRefeicoes = total;
    }
    public double getTotalDeRefeicoes(){
        return this.totalRefeicoes;
    }
    
    public void addAlimento(AlimentoFicha alimentoFicha){
        this.listaDeAlimentos.add(alimentoFicha);
    }
    
    public AlimentoFicha getAliemnto(int index){
        return this.listaDeAlimentos.get(index);
    }
}
