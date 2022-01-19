/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigncsd;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.TreeSet;

/**
 *
 * @author Legon
 */
public class AsignCSD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MyList list= new MyList();
         String link ;
       // link="\\New folder\\news.txt";
       Path path2 = Paths.get("products.txt");
       link=path2.toString();
       list.readfromfile(link);
        System.out.println("\n1.");
       System.out.println("Have Cookie? ");
        System.out.println(list.havepname());
        System.out.println("have price more than 30?");
        System.out.println(list.havepreice());
        System.out.println("\n2.");
        list.traverse();
        System.out.println("\n3.");
        System.out.println("You can see the result at 4");
        list.sortprice();
        list.deleth(1);
        
        System.out.println("\n4.");
        list.traverse();
        System.out.println("\n5.Has sort and print:");
        list.sortname();
        list.traverse();
        System.out.println("\n6.");
      list.saveToFile(link);
       
    }
    
}
