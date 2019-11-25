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
public class ListaTarefasLazer extends ListaTarefas 
{
    private String tipo="lazer";
    public ListaTarefasLazer(String nome_tarefa,String dat) 
    {
        super(nome_tarefa,dat);
    }

    public String getTipo() 
    {
        return tipo;
    }
    
    
}
