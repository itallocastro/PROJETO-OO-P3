/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

import java.util.ArrayList;

/**
 *
 * @author Castro Alves
 */
public abstract class ListaTarefas 
{
    private String nome_tarefa;

    public ListaTarefas(String nome_tarefa) 
    {
        this.nome_tarefa = nome_tarefa;
    }

    public String getNome_tarefa() 
    {
        return nome_tarefa;
    }

    public void setNome_tarefa(String nome_tarefa) 
    {
        this.nome_tarefa = nome_tarefa;
    }
      
}
