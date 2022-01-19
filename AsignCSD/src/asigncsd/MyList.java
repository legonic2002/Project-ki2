/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigncsd;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;



/**
 *
 * @author Legon
 */
public class MyList{
    Node head;
    Node tail;
    ArrayList<Products>  list = new ArrayList();
    
    MyList(){
        head= null;
        tail= null;
    }
    
    boolean isEmpty(){
        return head== null;  
    }
    
    void clear(){
        head=null;
        tail=null;
    }
    //1
    void addFirst(Products x){
        Node p = new Node(x);
        if(isEmpty()){
            head= p;
            tail= p;
        }
        else{
            p.next = head;
            head= p;
        }
    }
    //3
    void traverse(){
        Node p =head;
        if(count()==0){
            System.out.println("It is empty!");
        }
        while(p !=null){
            System.out.print(p.info);
            if(p.next!=null){
                System.out.println();
            
            }
            p= p.next;
                    
        }
        System.out.println();
    }
    void readfromfile(String fn){
        File f = new File(fn);

        if (!f.exists()) System.out.println("Not found!");;
        try {
             
            FileReader fr = new FileReader(f); 

            BufferedReader bf = new BufferedReader(fr); 
            
   
            String line; 
        
            while((line = bf.readLine())!= null){              
                line = line.trim();
                 StringTokenizer stk = new StringTokenizer(line, " | ");
                    String pcode = stk.nextToken().trim();
                    String pname = stk.nextToken().trim();
                    int quantity =Integer.parseInt(stk.nextToken().trim()) ;
                     double price =Double.parseDouble(stk.nextToken().trim()) ;
                 this.addFirst(new Products(pcode,pname,quantity,price));
            }
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Failed!");
        }
    }
      public int count() 
    {
      Node p = head; int c = 0;
      while(p != null) {c++; p = p.next;}
      return c;
    }
       public Node get(int k) 
    {Node p = head; int c = 0;
      while(p != null && c < k) {c++; p = p.next;}
      return p;
    }


        
        
    public boolean saveToFile(String filename)  {
        Node p = null;
        try {
            FileWriter fw = new FileWriter(filename);
            
                PrintWriter pw = new PrintWriter(fw);
            for (int i=0;i<count();i++){ 
                pw.println(get(i).info);
            }
                pw.close();
                fw.close();
            System.out.println("Save Succcess!");
            return true;
            
        } catch (Exception e) {
            System.err.println(e);
            return false;
        }
    }
        public Node search(int x){
        Node p = head;
        while( p.info.price != x) p = p.next;
        return p;
    }

          public void sort() 
    {int n = count();
     for (int i = 0; i < n - 1; i++) 
     {for (int j = i + 1; j < n; j++) 
     {Node pi = get(i), pj = get(j);
       if(pi.info.price > pj.info.price) {
        Products t = pi.info; 
        pi.info = pj.info; 
        pj.info = t;}
     }}
    }
                      public void sortname() 
    {int n = count();
     for (int i = 0; i < n - 1; i++) 
     {for (int j = i + 1; j < n; j++) 
     {Node pi = get(i), pj = get(j);
       if(pi.info.pname.charAt(0) > pj.info.pname.charAt(0)) {
        Products t = pi.info; 
        pi.info = pj.info; 
        pj.info = t;}
     }}
    }

    
        public  boolean havepname() {
        boolean is=true;
       for(int i=0;i<count();i++){
           if(get(i).info.pname.contains("Cookie")){
               is=true;
           }
           
       }
    return is;
    }
     public void sortprice() 
    {int n = count();
     for (int i = 0; i < n - 1; i++) 
     {for (int j = i + 1; j < n; j++) 
     {Node pi = get(i), pj = get(j);
       if(pi.info.price < pj.info.price) {
        Products t = pi.info; pi.info = pj.info; pj.info = t;}
     }}
    }
             
        public  boolean havepreice() {
        boolean is=false;
       for(int i=0;i<count();i++){
           if(get(i).info.price>30){
               is=true;
           }
       }

    return is;
    }
        void deleth(int i){
    Node q= get(i);
  Node f,p; f=null;p=head;
  while(p!=null)
   {if(p==q) break;
    f=p;p=p.next;
   }
  if(p==null) return;
  if(f==null)
   {head=head.next;
    if(head==null) tail=null;
    return;
   }
  f.next=p.next;
  if(f.next==null) tail=f;
 }
}

