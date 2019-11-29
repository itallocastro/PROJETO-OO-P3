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
public abstract class ListaTarefas<E>  implements Comparable<ListaTarefas>
{
    private String nome_tarefa;
    private boolean concluse;
    private Date data;
    private E horas = (E) "00:00:00";
    private boolean correct=false;
    private String tipo;
    private int contado = 0;

    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    
    
    public E getHoras() 
    {
        
        return horas;
    }

    public void setHoras(E horas) 
    {
        this.horas = horas;
    }

    public ListaTarefas(String nome_tarefa,String dat) 
    {
        this.nome_tarefa = nome_tarefa;
       
          while(!correct)
          {
              
            try 
            {
                
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(dat);
                correct=true;
            } 
            catch (ParseException ex) 
            {
                dat=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");
                

            }
          }
        
    }
    public ListaTarefas(String nome_tarefa,String type,String dat) 
    {
        this.nome_tarefa = nome_tarefa;
        this.tipo = type;
       
          while(!correct)
          {
              
            try 
            {
                
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(dat);
                correct=true;
            } 
            catch (ParseException ex) 
            {
                dat=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");
                

            }
          }
        
    }
    public ListaTarefas()
    {
        
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

    public void setData(String data) 
    {
        correct = false;
        
        while(!correct)
          {
              
            try 
            {
                
                this.data=new SimpleDateFormat("dd/MM/yyyy").parse(data);
                correct=true;
            } 
            catch (ParseException ex) 
            {
                data=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");

            }
            catch (NullPointerException ex) 
            {
                data=JOptionPane.showInputDialog("Digite uma data válida: (ex: dd/mm/yyyy)");

            }
          }
        
    }
    
    public String hora_format(int contador)
    {
        int segundo = contador % 60;
        int minutos = contador / 60;
        int horas1 = minutos / 60;
        minutos %= 60;
        return String.format("%02d:%02d:%02d", horas1,minutos,segundo);           
                    
                    
    }
    public void setContado(int i) 
    {
        this.contado=i;
    }
    public int getContado()
    {
        return this.contado;
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
