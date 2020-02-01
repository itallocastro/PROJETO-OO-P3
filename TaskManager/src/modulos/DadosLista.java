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
public class DadosLista<E> {
     public String nome;
     public Date data;
     public boolean concluse;
     public boolean correct_dat = false;
     private E horas = (E) "00:00:00";
     
     public DadosLista() {
         
     }

    public DadosLista(String nome, String data, boolean concluse) {
        this.nome = nome;
        this.concluse = concluse;
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
                if(data==null)
                {
                    data = "31/12/1900";
                }
            }
        }
    }
    public DadosLista(String nome, String data) {
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
                if(data==null)
                {
                    data = "31/12/1900";
                }
            }
        }
    }
    public void setData(String data) {
        correct_dat=false;
        while(!correct_dat)
        {
            if(data==null)
            {
                data = "31/12/1900";
            }
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
    
    public boolean isConcluse() {
        return concluse;
    }

    public void setConcluse(boolean concluse) {
        this.concluse = concluse;
    }

    public E getHoras() {
        return horas;
    }

    public void setHoras(E horas) {
        this.horas = horas;
    }
    
    public String hora_format(int contador)
    {
        return new FormataHoras().formataString(contador);           
                                     
    }
     
    
}
