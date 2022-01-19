/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0104;
import java.lang.*;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
/**
 *
 * @author Legon
 */
public class J1SP0104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("Please enter directory of file:");
        Scanner sc= new Scanner(System.in);
        String link = sc.nextLine();
       // link="\\New folder\\news.txt";
       Path path2 = Paths.get(link);
       link=path2.toString();
        LoadandFind p1= new LoadandFind(link);
       // C:\\Users\\Legon\\Videos\\news.txt
    }
    
}
