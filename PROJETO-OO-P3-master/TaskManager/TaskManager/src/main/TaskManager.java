package main;

import java.awt.Frame;
import java.util.Scanner;
import menu.TelaLogin;
/**
 *
 * @author Castro Alves
 */
public class TaskManager {

    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Frame TaskManager1 = null;
        TelaLogin login = new TelaLogin(TaskManager1,true);
        login.setVisible(true);
             

    }
    
}
