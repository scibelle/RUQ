/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desperdiciozero.controle.bancofake;

import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author Acer
 */
public class ControleDeArquivos {
    
    //--------------------------------------------------------------------------
    //-------------------------------Persiste dados em arquivo------------------
    //--------------------------------------------------------------------------
    public static void gravar(Object object, String caminho){
        FileOutputStream arquivo;
        ObjectOutputStream stream;
        
        try {        
            arquivo = new FileOutputStream(caminho);
            stream = new ObjectOutputStream(arquivo);
            
            stream.writeObject(object);
            stream.close();
            
        } catch (IOException e) {
            System.out.println("----------------------------Erro na gravação-----------------------------");
            e.printStackTrace();
        }
    }
    
    //--------------------------------------------------------------------------
    //-------------------------------Recupera dados de arquivo------------------
    //--------------------------------------------------------------------------
    public static Object recuperar(String caminho){
        FileInputStream arquivo;
        ObjectInputStream stream;
        Object object = null;
        
        try {
            
            arquivo = new FileInputStream(caminho);
            stream = new ObjectInputStream(arquivo);
            
            object = stream.readObject();
            stream.close();
            
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("---------------------------Erro ao tentar recuperar dados---------------------------------");
            e.printStackTrace();
        }
        
        return object;
    }
}
