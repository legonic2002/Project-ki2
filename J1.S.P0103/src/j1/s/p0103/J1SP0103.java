/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
import java.text.ParseException;
import java.util.*;
/**
 *
 * @author Legon
 */
public class J1SP0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
         String day=sc.nextLine();
         compare p1 = new compare();
        while(p1.isValid(day)==false){
           System.out.println("Your input is wrong format dd/M/yyyy and don't have negative number:");
           day=sc.nextLine();
           }
         String day2=sc.nextLine();
         while(p1.isValid(day2)==false){
           System.out.println("Your input is wrong format dd/M/yyyy and don't have negative number:");
           day2=sc.nextLine();
           }
         compare p2= new compare();
         p2.Check(day, day2);
         //String result= p2.Check(day,day2);
    //     System.out.println(result);
    }
    
}
