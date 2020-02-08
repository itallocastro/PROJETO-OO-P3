package modulos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Castro Alves
 */
public abstract class ListaTarefas  implements Comparable<ListaTarefas>
{
    private String nome_tarefa;
    private boolean concluse;
    private Date data;
    private int horas;
    private String horas_formatadas;
    private boolean correct=false;

    public int getHoras() 
    {
        return horas;
    }

    public void setHoras(int horas) 
    {
        this.horas = horas;
    }

    public ListaTarefas(String nome_tarefa,String dat) 
    {
        this.nome_tarefa = nome_tarefa;
       
            
            try 
            {
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(dat);
                correct=true;
            } 
            catch (ParseException ex) 
            {
                JOptionPane.showMessageDialog(null, "Insira uma data válida.");

            }
        
    }

    public boolean isCorrect() 
    {
        return correct;
    }

    public void setCorrect(boolean correct) 
    {
        this.correct = correct;
    }
    

    public String getNome_tarefa() 
    {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) 
    {
        this.nome_tarefa = nome_tarefa;
    }

    public boolean isConcluse() {
        return concluse;
    }

    public void setConcluse(boolean concluse) {
        this.concluse = concluse;
    }

    public Date getData() 
    {
        return data;
    }

    public void setData(Date data) 
    {
        this.data = data;
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
    public int compareTo(ListaTarefas o) 
    {
        if(this.data.after(o.getData()))
        {
            
            return 1;
        }
        else if(this.data.before(o.getData()))
        {
            return -1;
        }
        return 0;
    }
    
    
    
      
}
