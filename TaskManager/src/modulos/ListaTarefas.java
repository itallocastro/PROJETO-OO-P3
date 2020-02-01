
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
public class ListaTarefas extends DadosLista implements Comparable<ListaTarefas>
{
//    private String nome_tarefa;
//    private boolean concluse=false;
//    private Date data;
//    private E horas = (E) "00:00:00";
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
    public ListaTarefas() {
        
    }
    public ListaTarefas(String nome_tarefa,String dat) 
    {
        super(nome_tarefa,dat);   
    }
    public ListaTarefas(String nome_tarefa,String type,String dat) 
    {
        super(nome_tarefa,dat);
        this.tipo = type;    
    }
    
    public boolean isCorrect() 
    {
        return correct;
    }

    public void setCorrect(boolean correct) 
    {
        this.correct = correct;
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
