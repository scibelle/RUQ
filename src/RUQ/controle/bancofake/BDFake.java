/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.controle.bancofake;

import RUQ.modelo.FichaSensorial;
import RUQ.modelo.AnaliseSensorial;
import RUQ.modelo.Temperatura;
import RUQ.modelo.FichaRecebimento;
import RUQ.modelo.AlimentoFichaSensorial;
import RUQ.modelo.AlimentoFichaRecebimento;
import RUQ.modelo.Tickets;
import RUQ.modelo.Cuba;
import RUQ.modelo.Funcionario;
import RUQ.modelo.Alimento;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Jorge
 */
public class BDFake implements Serializable{
    public static ArrayList<FichaRecebimento> bfFichaRecebimento = new ArrayList<>();
    public static ArrayList<FichaSensorial> bfFichaSensorial = new ArrayList<>();
    public static ArrayList<Alimento> bfAlimento = new ArrayList<>();
    public static ArrayList<AlimentoFichaRecebimento> bfAliemntoFichaRecebimento = new ArrayList<>();
    public static ArrayList<AlimentoFichaSensorial> bfAlimentoFichaSensorial = new ArrayList<>();
    public static ArrayList<AnaliseSensorial> bfAnaliseSensorial = new ArrayList<>();
    public static ArrayList<Cuba> bfCuba = new ArrayList<>();
    public static ArrayList<Funcionario> bfFuncionario = new ArrayList<>();
    public static ArrayList<Temperatura> bfTemperatura = new ArrayList<>();
    public static ArrayList<Tickets> bfTickets = new ArrayList<>();
    
}
