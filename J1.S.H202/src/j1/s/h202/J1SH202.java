/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.h202;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
public class J1SH202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   String aray;
   Scanner sc= new Scanner(System.in);
   System.out.println("Input your aray");
    aray= sc.nextLine();
    printReverse p1= new printReverse(aray);
    }
    
}
