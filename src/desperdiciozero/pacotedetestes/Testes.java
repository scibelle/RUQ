/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.pacotedetestes;

import desperdiciozero.controle.CtlAlimento;
import desperdiciozero.controle.CtlAlimentoFichaAnaliseSensorial;
import desperdiciozero.controle.CtlAnaliseSensorial;
import desperdiciozero.controle.CtlCuba;
import desperdiciozero.controle.CtlFichaSensorial;
import desperdiciozero.controle.CtlFuncionario;
import desperdiciozero.controle.bancofake.BDFake;
import desperdiciozero.modelo.Funcionario;
import desperdiciozero.modelo.Tipo;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel Jorge
 */
public class Testes {
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
        Scanner entrada;
        
        CtlAlimentoFichaAnaliseSensorial ctlAlimentoFS;
        CtlFuncionario ctlFuncionario;
        CtlAnaliseSensorial ctlAnaliseSensorial;
        CtlFichaSensorial ctlFichaSensorial;
        
        // cadastro de 3 alimentos 
        ctlAlimentoFS = new CtlAlimentoFichaAnaliseSensorial();
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 1", 100.0);
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 2", 150.0);
        ctlAlimentoFS.cadastrarAlimentoFichaSensorial("Alimento 3", 200.0);
        
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
        // ver a nova API para se tralhar com datas e horas
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
        

        System.out.println("-------------------------Listagem---------------------------------");
        listar(BDFake.bfFichaSensorial);
    }
    
    public static void listar(ArrayList qualquerCoisa){
        for(Object o : qualquerCoisa){
            System.out.println(o.toString());
        }
    }
    
    public static void main(String[]args){
        testeCadastrarFichaSensorial();
    }
}
