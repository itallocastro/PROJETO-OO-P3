/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ListaMetas implements Comparable<ListaMetas>
{
    private String nome;
    private Date data;
    private int horas;
    private boolean concluse;
    private boolean correct_dat=false;
    private String obs;

    public ListaMetas(String nome, String data, boolean concluse) {
        this.nome = nome;
        while(!correct_dat)
        {
            
            try 
            {
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(data);
                correct_dat = true;
                
            }
            catch (ParseException ex) 
            {
                data=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");
            }
        }
        this.concluse = concluse;
    }

    public ListaMetas(String nome, String data,boolean concluse,String obs) 
    {
        this.nome = nome;
        while(!correct_dat)
        {
            
            try 
            {
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(data);
                correct_dat = true;
                
            }
            catch (ParseException ex) 
            {
                data=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");
            }
        }
        this.concluse=concluse;
        this.obs = obs;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isConcluse() {
        return concluse;
    }

    public void setConcluse(boolean concluse) {
        this.concluse = concluse;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
      public String hora_format(int contador)
        {
            int segundo = contador % 60;
            int minutos = contador / 60;
            int horas1 = minutos / 60;
            minutos %= 60;
            return String.format("%02d:%02d:%02d", horas1,minutos,segundo);                        
        }

    @Override
    public int compareTo(ListaMetas t) 
    {
        if(this.data.after(t.getData()))
        {
            
            return 1;
        }
        else if(this.data.before(t.getData()))
        {
            return -1;
        }
        return 0;
    }
    
    
    
}
