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
public class ListaTarefasLazer extends ListaTarefas 
{
    private String tipo="lazer";
    public ListaTarefasLazer(String nome_tarefa) 
    {
        super(nome_tarefa);
    }

    public String getTipo() 
    {
        return tipo;
    }
    
    
}
