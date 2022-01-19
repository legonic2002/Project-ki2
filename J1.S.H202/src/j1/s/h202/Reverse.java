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
class printReverse {
        Scanner sc= new Scanner(System.in);

    printReverse(String aray) {
//       while(aray.isEmpty()){
//            System.err.println("It is empty. Please input again");
//            aray=sc.nextLine();
//        }
       StringBuilder aray1 = new StringBuilder(aray);
            aray1.reverse();
            
        String aray2 = aray1.toString();
        System.out.println(aray2.trim());
       
    }
    
}
