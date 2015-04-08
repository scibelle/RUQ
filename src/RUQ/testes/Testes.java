/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.testes;

import RUQ.controle.CtlAlimento;
import RUQ.controle.CtlAlimentoFichaAnaliseSensorial;
import RUQ.controle.CtlAlimentoFichaRecebimento;
import RUQ.controle.CtlAnaliseSensorial;
import RUQ.controle.CtlCuba;
import RUQ.controle.CtlFichaRecebimento;
import RUQ.controle.CtlFichaSensorial;
import RUQ.controle.CtlFuncionario;
import RUQ.controle.CtlTickets;
import RUQ.controle.bancofake.BDFake;
import RUQ.controle.bancofake.ControleDeArquivos;
import RUQ.modelo.AlimentoFichaRecebimento;
import RUQ.modelo.AlimentoFichaSensorial;
import RUQ.modelo.Cuba;
import RUQ.modelo.FichaRecebimento;
import RUQ.modelo.FichaSensorial;
import RUQ.modelo.Funcionario;
import RUQ.modelo.Tipo;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Jorge
 */
public class Testes {
    public static String caminho = "c:\\Binarios\\";
    public static String fichaSensorial = "FichaSensorial.sav";
    public static String fichaRecebimento = "FichaRecebimento.sav";
    
    // -------------------------------------------------------
    // -----------------------testes--------------------------
    // -------------------------------------------------------
    
    // -----------------cadastro de alimentos-----------------
    public static void testeCadastrarAlimento(){
        Scanner entrada;
        String nome;
        double percapta;
        CtlAlimento ctlAlimento = new CtlAlimento();
        
        System.out.println("-------------------------Cadastro de alimento-------------------------------");
        System.out.println("Informe um nome:");
        entrada = new Scanner(System.in);
        nome = entrada.next();
        
        System.out.println("Informe a percapta:");
        entrada = new Scanner(System.in);
        percapta = entrada.nextDouble();
        ctlAlimento.cadastrarAlimento(nome, percapta);
        
        System.out.println("Informe um nome:");
        entrada = new Scanner(System.in);
        nome = entrada.next();
        
        System.out.println("Informe a percapta:");
        entrada = new Scanner(System.in);
        percapta = entrada.nextDouble();
        ctlAlimento.cadastrarAlimento(nome, percapta);
   
        System.out.println("-------------------------Listagem de alimentos---------------------------------");
        listar(BDFake.bfAlimento);
    }
    
      // -----------------cadastro de cuba-----------------
      public static void testeCadastrarCuba(){
        Scanner entrada;
        String nome;
        double peso;
        CtlCuba ctlCuba = new CtlCuba();
        
        System.out.println("-------------------------Cadastro de cuba-------------------------------");
        System.out.println("Informe um nome:");
        entrada = new Scanner(System.in);
        nome = entrada.next();
        
        System.out.println("Informe um peso:");
        entrada = new Scanner(System.in);
        peso = entrada.nextDouble();
        ctlCuba.cadastrarCuba(nome, peso);
        
        System.out.println("Informe um nome:");
        entrada = new Scanner(System.in);
        nome = entrada.next();
        
        System.out.println("Informe um peso:");
        entrada = new Scanner(System.in);
        peso = entrada.nextDouble();
        ctlCuba.cadastrarCuba(nome, peso);
   
        System.out.println("-------------------------Listagemde cubas---------------------------------");
        listar(BDFake.bfCuba);
    }
      
    // -----------------cadastro de ficha sensorial-----------------
    public static void testeCadastrarFichaSensorial(){
        
        CtlAlimentoFichaAnaliseSensorial ctlAlimentoFS;
        CtlFuncionario ctlFuncionario;
        CtlAnaliseSensorial ctlAnaliseSensorial;
        CtlFichaSensorial ctlFichaSensorial;
        
        // cadastro de 3 alimentos 
        ctlAlimentoFS = new CtlAlimentoFichaAnaliseSensorial();
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 1", 100.0);
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 2", 150.0);
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 3", 200.0);
        
        AlimentoFichaSensorial alimento1 = BDFake.bfAlimentoFichaSensorial.get(0);
        AlimentoFichaSensorial alimento2 = BDFake.bfAlimentoFichaSensorial.get(1);
        AlimentoFichaSensorial alimento3 = BDFake.bfAlimentoFichaSensorial.get(2);
        
        System.out.println("-------------------------Alimentos cadastrados-------------------------------");
        
        // cadastro de uma analise sensorial
        ctlAnaliseSensorial = new CtlAnaliseSensorial();
        ctlAnaliseSensorial.cadastrarAnaliseSensorial(true, true, true, false);
        
        System.out.println("-------------------------Análise sensorial cadastrada-------------------------------");
        
        // cadastro de um funcionário responsável pela entrega
        ctlFuncionario = new CtlFuncionario();
        ctlFuncionario.cadastrarFuncionario("Funcionario responsavel pela entrega");
        ctlFuncionario.cadastrarFuncionario("Funcionario responsavel pela analise");
        
        System.out.println("-------------------------Funcionarios cadastrados-------------------------------");
        
        // cadastro de uma ficha de analise sensorial
        ctlFichaSensorial = new CtlFichaSensorial();
        LocalTime horaDeEntrega = LocalTime.of(11, 30);
        LocalTime inicioDaDistribuicao = LocalTime.of(12, 00);
        Funcionario funcionarioResponsavel = BDFake.bfFuncionario.get(0);
        Funcionario responsavelPelaAnalise = BDFake.bfFuncionario.get(1);
        ctlFichaSensorial.cadastrarFichaSensorial("Cardápio 1", 
                horaDeEntrega,
                inicioDaDistribuicao, 
                funcionarioResponsavel, 
                Tipo.JANTAR, 
                responsavelPelaAnalise);
        
        System.out.println("-------------------------Ficha sensorial cadastrada-------------------------------");
        
        ctlFichaSensorial.addAlimentoFichaSensorial(alimento1);
        ctlFichaSensorial.addAlimentoFichaSensorial(alimento2);
        ctlFichaSensorial.addAlimentoFichaSensorial(alimento3);
        
        System.out.println("-------------------Alimentos da Ficha Sensorial Adicionados-----------------");
        System.out.println("-------------------------Listagem---------------------------------");
        listar(BDFake.bfFichaSensorial);
        
       System.out.println("---------------------------Tentando salvar em arquivo binário-----------------------------");
        ControleDeArquivos.gravar(BDFake.bfFichaSensorial, caminho+fichaSensorial);
        System.out.println("---------------------------Arquivo salvo com sucesso-----------------------------");
        
        System.out.println("---------------------------Tentando recuperar dados de arquivo----------------------------");
        ArrayList<FichaSensorial> ficha = (ArrayList<FichaSensorial>) ControleDeArquivos.recuperar(caminho+fichaSensorial);
        System.out.println("---------------------------Dados recuperados-----------------------------");
        
        System.out.println("---------------------------Adicionando dados ao banco-----------------------------");
        BDFake.bfFichaSensorial = ficha;
        System.out.println("---------------------------Dados adicionados ao banco-----------------------------");
        System.out.println("---------------------------Listando dados recuperados-----------------------------");
        listar(ficha);
    }
    
    // -----------------cadastro de ficha de recebimento-----------------
    public static void testeCadastroDeFichaDeRecebimento(){
        CtlCuba ctlCuba;
        CtlAlimentoFichaRecebimento ctlAlimentoFichaRecebimento;
        CtlTickets ctlTickets;
        CtlFichaRecebimento ctlFichaRecebimento;
        
        // cadastro de dois tipos de cuba
        ctlCuba = new CtlCuba();
        ctlCuba.cadastrarCuba("Cuba 1", 100.0);
        ctlCuba.cadastrarCuba("Cuba 2", 200.0);
        
        // cadastro de dois AlimentoFichaDeRecebimento
        ctlAlimentoFichaRecebimento = new CtlAlimentoFichaRecebimento();
        Cuba cuba1 = BDFake.bfCuba.get(0);
        Cuba cuba2 = BDFake.bfCuba.get(1);
        
        System.out.println("-------------------------Cubas cadastradas-------------------------------");
        
        // valores base para os cálculos de peso real
        double pesoBase1 = 2000.0;
        double pesoBase2 = 1500.0;
        
        // cálculo de peso real
        double pesoReal1 = pesoBase1 - cuba1.getPeso();
        double pesoReal2 = pesoBase2 - cuba2.getPeso();
        
        // valores base para o cálculo de peso real das sobras sujas
        double pesoBaseSobrasSujas1 = 740.0;
        double pesoBaseSobrasSujas2 = 977.0;
        
        // cálculo de peso real das sobras sujas
        double pesoRealSobrasSujas1 = pesoBaseSobrasSujas1 - cuba1.getPeso();
        double pesoRealSobrasSujas2 = pesoBaseSobrasSujas2 - cuba2.getPeso();
        
        // percapta e porções
        double percapta1 = 200.0;
        double percapta2 = 150.0;
        double porcoesSobrasSujas1 = (pesoRealSobrasSujas1/percapta1);
        double porcoesSobrasSujas2 = (pesoRealSobrasSujas2/percapta2);

        // quantidade total de porções
        double totalPorcoes1 = (pesoReal1/percapta1);
        double totalPorcoes2 = (pesoReal2/percapta2);
        
        System.out.println("-------------------------Cálculos feitos-------------------------------");
        
        ctlAlimentoFichaRecebimento.cadastrarAlimentoFichaRecebimento("Alimento 1", 
                percapta1, 
                pesoBase1, 
                pesoReal1, 
                pesoBaseSobrasSujas1, 
                pesoRealSobrasSujas1, 
                porcoesSobrasSujas1, 
                totalPorcoes1, 
                cuba1);
        ctlAlimentoFichaRecebimento.cadastrarAlimentoFichaRecebimento("Alimento 2", 
                percapta2, 
                pesoBase2, 
                pesoReal2, 
                pesoBaseSobrasSujas2, 
                pesoRealSobrasSujas2, 
                porcoesSobrasSujas2, 
                totalPorcoes2, 
                cuba2);
        
        AlimentoFichaRecebimento alimento1 = BDFake.bfAliemntoFichaRecebimento.get(0);
        AlimentoFichaRecebimento alimento2 = BDFake.bfAliemntoFichaRecebimento.get(1);
        
        System.out.println("-------------------------Alimentos cadastrados-------------------------------");
        
        // cadastro de tickets
        ctlTickets = new CtlTickets();
        ctlTickets.cadastrarTotalDeTickets(200, 
                20, 
                0, 
                35);
        
        System.out.println("-------------------------Total de tickets cadastrados-------------------------------");
        
        // cadastrar uma ficha de recebimento
        ctlFichaRecebimento = new CtlFichaRecebimento();
        LocalDate data = LocalDate.of(2014, 11, 15);
        ctlFichaRecebimento.cadastrarFichaRecebimento(data, 
                "Semana 1", 
                Tipo.ALMOCO, 
                3000.0, 
                true, 
                totalPorcoes2);
        
        System.out.println("-------------------------Ficha de recebimento cadastrada-------------------------------");
        
        ctlFichaRecebimento.addAlimentoFichaRecebimento(alimento1);
        ctlFichaRecebimento.addAlimentoFichaRecebimento(alimento2);
        
        System.out.println("-------------------------Alimentos cadastrados-------------------------------");
        
        System.out.println("-------------------------Listagem-------------------------------");
        listar(BDFake.bfFichaRecebimento);
        
        System.out.println("---------------------------Tentando salvar em arquivo binário-----------------------------");
        ControleDeArquivos.gravar(BDFake.bfFichaRecebimento, caminho+fichaRecebimento);
        System.out.println("---------------------------Arquivo salvo com sucesso-----------------------------");
        
        System.out.println("---------------------------Tentando recuperar dados de arquivo----------------------------");
        ArrayList<FichaRecebimento> ficha = (ArrayList<FichaRecebimento>) ControleDeArquivos.recuperar(caminho+fichaRecebimento);
        System.out.println("---------------------------Dados recuperados-----------------------------");
        
        System.out.println("---------------------------Adicionando dados ao banco-----------------------------");
        BDFake.bfFichaRecebimento = ficha;
        System.out.println("---------------------------Dados adicionados ao banco-----------------------------");
        System.out.println("---------------------------Listando dados recuperados-----------------------------");
        listar(ficha);
    }
    
    // -----------------listagem-----------------
    public static void listar(ArrayList qualquerCoisa){
        qualquerCoisa.stream().forEach((o) -> {
            System.out.println(o.toString());
        });
    }
    
    public static void main(String[]args){
        testeCadastrarFichaSensorial();
    }
}
