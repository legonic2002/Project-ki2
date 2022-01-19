/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package molecules;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
public class Behaviors {
    List<State> list = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    public void Constructor(){
        System.out.println("Input Structure:");
        int struc= sc.nextInt();
        Scanner sc= new Scanner(System.in);
        System.out.println("Input name:");
        String na =sc.nextLine();
        System.out.println("Input Weight:");
        int weight = sc.nextInt();
        while(weight>100){
            System.out.println("weight less than 100");
            weight=sc.nextInt();
        }   
        list.add(new State(struc,na,weight));
    }
     public void Display(){
         for(int i=0;i<list.size();i++){
         System.out.println(list.get(i));}
     }
}
