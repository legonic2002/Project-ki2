/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atoms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Legon
 */
public class Behaviors {
    List<State> list = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public boolean accept(){
        
        try{
        System.out.print("Input Number");
        int num= sc.nextInt();
         Scanner sc= new Scanner(System.in);
        System.out.print("Input Symbol");
        String sym= sc.nextLine();
        System.out.print("Input Fullname");
        String full= sc.nextLine();
         Scanner sb= new Scanner(System.in);
        System.out.print("Input Weight");
        double weight= sb.nextDouble();
        list.add(new State(num,sym,full, weight));
        return true;
        }
        catch (Exception e){
            System.out.println("");
        return false;
           
        }
    }
    
            
    public void Display(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
