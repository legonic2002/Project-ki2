/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loc100.j1.s.h203;

/**
 *
 * @author Legon
 */
public class NewClass {

   public static void main(String args[]) {
       //One way of doing concatenation
       String str1 = "Welcome";
       str1 = str1.concat(" to ");
       str1 = str1.concat(" String handling ");
       System.out.println(str1);

       //Other way of doing concatenation in one line
       String str2 = "This";
       str2 = str2.concat(" is").concat(" just a").concat(" String");
       System.out.println(str2);
   }
}

