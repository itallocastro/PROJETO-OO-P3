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
public class BancoUsuarios 
{
    ArrayList<ContasUsuarios> banco_usu = new ArrayList<>();

    public BancoUsuarios() 
    {
            ContasUsuarios u1 = new ContasUsuarios("itallocastro","123");
            ContasUsuarios u2 = new ContasUsuarios("maravilhosa99","eumeamo123");
            ContasUsuarios u3 = new ContasUsuarios("jose1999","jose1999");
            banco_usu.add(u1);
            banco_usu.add(u2);
            banco_usu.add(u3);
        
    }

    public ArrayList<ContasUsuarios> getBanco_usu() 
    {
        return banco_usu;
    }

    public void setBanco_usu(ArrayList<ContasUsuarios> banco_usu) 
    {
        this.banco_usu = banco_usu;
    }
    
    
   
    
   
}
