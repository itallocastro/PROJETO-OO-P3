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
public class ListaTarefasEstudos extends ListaTarefas
{
    private String nome_materia;

    public ListaTarefasEstudos(String nome_tarefa,String nome_materia) 
    {
        super(nome_tarefa);
        this.nome_materia = nome_materia;
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
