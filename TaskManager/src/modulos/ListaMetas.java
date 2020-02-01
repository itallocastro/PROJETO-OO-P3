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
public class ListaMetas extends DadosLista implements Comparable<ListaMetas>
{
//    private String nome;
//    private Date data;
//    private int horas;
//    private boolean concluse;
//    private boolean correct_dat=false;
    private String obs;

    public ListaMetas(String nome, String data, boolean concluse) {
        super(nome,data,concluse);
//        this.nome = nome;
//        while(!correct_dat)
//        {
//            
//            try 
//            {
//                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(data);
//                correct_dat = true;
//                
//            }
//            catch (ParseException ex) 
//            {
//                data=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");
//                if(data==null)
//                {
//                    data = "31/12/1900";
//                }
//            }
//        }
//        this.concluse = concluse;
    }

    public ListaMetas(String nome, String data,boolean concluse,String obs) 
    {
        super(nome,data,concluse);
        this.obs = obs;
    }
    

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    public String hora_format(int contador)
    {
        return new FormataHoras().formataString(contador);
                                    
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
