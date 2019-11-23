package modulos;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Castro Alves
 */
public abstract class ListaTarefas 
{
    private String nome_tarefa;
    private boolean concluse;
    private Date data;

    public ListaTarefas(String nome_tarefa,String dat) 
    {
        this.nome_tarefa = nome_tarefa;
        try 
        {
            this.data=new SimpleDateFormat("dd/MM/yyyy").parse(dat);
        } 
        catch (ParseException ex) 
        {
            Logger.getLogger(ListaTarefas.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    
      
}
