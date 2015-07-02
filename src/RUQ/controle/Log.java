/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RUQ.controle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Isaias
 */
public class Log {
    
    public static void writeToLog(String mensagem)
    {
                 try {
                        DateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
                        Calendar cal = Calendar.getInstance();
                        
			File file = new File("C:/RUQlogs/log" + dateFormat.format(cal.getTime()) + ".txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
                                file.getParentFile().mkdirs();
				file.createNewFile();
			}
                        
                        //File directory = new File(tmp.getParentFile().getAbsolutePath());
                        //directory.mkdirs();

			FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
                        bw.write("===" + cal.getTime() +  "====\n");
			bw.write(mensagem);
                        bw.write("\n=============\n");
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
                        JOptionPane.showMessageDialog(null, " Erro ao gravar mensagem no log. " + e.getMessage() + "\n Envie-me um e-mail: luizisaias@alu.ufc.br");
		}
    }
    

}