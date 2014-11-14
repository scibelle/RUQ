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
    
    public FichaRecebimento(){}
    
    
}
