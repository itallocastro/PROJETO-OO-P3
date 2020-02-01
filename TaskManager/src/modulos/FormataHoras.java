/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Castro Alves
 */
public class FormataHoras 
{

    private boolean flag = false;
    public String formataString(int contador)
    {
            int segundo = contador % 60;
            int minutos = contador / 60;
            int horas1 = minutos / 60;
            minutos %= 60;
            return String.format("%02d:%02d:%02d", horas1,minutos,segundo);
    }
    public String formataString(String horas_string)
    {
      Date n = null;
      
      while(!flag)
      {
          
        try 
        {
            n = new SimpleDateFormat("hh:mm:ss").parse(horas_string);
            this.flag = true;
        } 
        catch (ParseException ex) {
            horas_string = JOptionPane.showInputDialog("Digite uma hora válida: (ex: hh:mm:ss)");
            if(horas_string==null)
            {
                horas_string = "00:00:00";
                
            }
        }
      }
      return new SimpleDateFormat("hh:mm:ss").format(n);
           
    }
}
