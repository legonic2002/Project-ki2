/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0102;

import java.lang.*;
import java.io.*;
import java.text.ParseException;
import java.util.*;
public class J1SP0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       // List<String> list1 = new ArrayList();
        Scanner sc= new Scanner(System.in);
        String day=sc.nextLine();
        Check c1= new Check();
        c1.Check(day);
//        int a1,a2,a3;
//     //   System.out.println(c1);
//     StringTokenizer stk1= new StringTokenizer(day,"/");
//              while(stk1.hasMoreTokens()){
//            list1.add(stk1.nextToken());     
//            }
//              a1=Integer.parseInt(list1.get(0));
//              a2=Integer.parseInt(list1.get(1));
//              a3=Integer.parseInt(list1.get(2));
//              System.out.println(a1);
//              System.out.println(a2);
//              System.out.println(a3);
    }
        
    
}
