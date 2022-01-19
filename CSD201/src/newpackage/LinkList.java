/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



/**
 *
 * @author Legon
 */
public class LinkList {
    public static void main(String[] args)  {
        MyList list= new MyList();
       // boolean p2;
       System.out.println("Please enter directory of file:");
        //Scanner sc= new Scanner(System.in);
        String link ;
       // link="\\New folder\\news.txt";
       Path path2 = Paths.get("100tr.txt");
       link=path2.toString();
        list.addFirst(new Person("A",2));
        list.addFirst(new Person("Dung",20));
//        list.addFirst(1);
//        list.addFirst(9);
  
    
        list.saveToFile(link);
        list.readfromfile(link);
        list.traverse(); 
        list.addFirst(new Person("Aasa",221));
        list.addFirst(new Person("Dung",200));
        list.saveToFile(link);
        list.readfromfile(link);
        list.traverse(); 
        System.out.println(list.count());
   //     System.out.println(list.printBytuoi(20));
       // System.out.println(list.search(20));
      list.delAfter(list.search(200));
      list.traverse();
      list.saveToFile(link);
      list.readfromfile(link);
      list.traverse();
      
       MyList newlist= new MyList();
       
       newlist.addFirst(new Person("Long",90));
        newlist.addFirst(new Person("Linh",100));
        MyList newlist2= new MyList();
        newlist2.addFirst(new Person("Hoang",1010));
       // newlist2.traverse();
       newlist.traverse();
       Node p1= list.head;
       Node p2= newlist.head;
       while(p1!= null ){
         
              newlist2.addLast(p1.info);
              p1=p1.next;     
       }
       while( p2!=null){
          
              newlist2.addLast(p2.info);
          p2=p2.next;    
       }

       newlist2.traverse();
       newlist2.sort();
       newlist2.traverse();
    }
    }

