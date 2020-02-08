/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Castro Alves
 */
public class ListaTarefasEstudos extends ListaTarefas
{
    private String nome_materia;
    
    
    public ListaTarefasEstudos(String nome_tarefa,String nome_materia, String dat) 
    {
        super(nome_tarefa,dat);
        this.nome_materia = nome_materia;
    }

    public ListaTarefasEstudos(String nome_tarefa, String tipo, String nome_materia, String dat) {
        super(nome_tarefa,tipo,dat);
    }

    public String getNome_materia() 
    {
        return nome_materia;
    }

    public void setNome_materia(String nome_materia) 
    {
        this.nome_materia = nome_materia;
    }

    
    
    
       
}
