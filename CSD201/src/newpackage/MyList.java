/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

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
    ArrayList<Person>  list = new ArrayList();
    ArrayList<Person>  list2 = new ArrayList();
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
    void addFirst(Person x){
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
                System.out.print("-");
            
            }
            p= p.next;
                    
        }
        System.out.println();
    }
    void readfromfile(String fn){
        File f = new File(fn);
//        int i=0;
//        int count=0;
        if (!f.exists()) System.out.println("Not found!");;
        try {
             
            FileReader fr = new FileReader(f); 
            
// call filereader
            BufferedReader bf = new BufferedReader(fr); 
            
            //call bufferreader
            String line; 
            //in bufferreader use readline than stringtokennizer
            while((line = bf.readLine())!= null){              
                line = line.trim();
                 StringTokenizer stk = new StringTokenizer(line, ",");
                    String name = stk.nextToken().trim();
                    int tuoi =Integer.parseInt(stk.nextToken().trim()) ;
                //i++;
                   list.add(new Person(name,tuoi));
                 // this.addLast(new Person(name,tuoi));
            }
            System.out.println("Sucessful!");
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("Failed!");
        }
    }
//    void readfromfile(String fn){
//        File f = new File(fn);
////        int i=0;
////        int count=0;
//        if (!f.exists()) System.out.println("Not found!");;
//        try {
//             
//            FileReader fr = new FileReader(f); 
//            
//// call filereader
//            BufferedReader bf = new BufferedReader(fr); 
//            
//            //call bufferreader
//            String line; 
//            //in bufferreader use readline than stringtokennizer
//            while((line = bf.readLine())!= null){              
//                line = line.trim();
//                 StringTokenizer stk = new StringTokenizer(line, ",");
//                    String name = stk.nextToken().trim();
//                    int tuoi =Integer.parseInt(stk.nextToken().trim()) ;
//                //i++;
//                   this.addFirst(new Person(name,tuoi));
//            }
//            System.out.println("Sucessful!");
//        } catch (Exception e) {
//            System.err.println(e);
//            System.out.println("Failed!");
//        }
//    }
    //2
    void addLast(Person x){
        Node p = new Node(x);
        if(tail==null){
            head = p;
            tail=p;   
        }
        else{
            tail.next=p;
            tail=p;
        }

    }
    //5
    void delFisrt(){
       // head=head.next;
    
       if(head==tail){
           head=tail=null;
       }
       else{
           head=head.next;
       }
    }
    void del(Node p){
        if(p==null) return;
        if(p==head){
            this.delFisrt();
        }
        if(p==tail)
            this.delLast();
        Node previous = head;
        while(previous.next!=p){
            previous = previous.next;
            previous.next=p.next;
        }
    }
    
    void addBefore(Node p, Person x){
        Node q = new Node(x);
        if(p==null)
        return;
        if(p==head){
            this.addFirst(x);
            return;
        }
    }
    //6
    void delLast(){
        //Node p = new Node(x);
//        if(head==tail){
//           head=tail=null;
//       }
//        else
//      //  tail=tail.next;
//        tail.next=null;
    Node ptr=head;
    Node ptr1 = null;
      while(ptr.next != null)  
                {  
                    ptr1 = ptr;  
                    ptr = ptr.next;  
                } 
      ptr1.next = null;  
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
//        public Node search(int k) 
//    {Node p = head; int c = 0;
//      while(p != null && p.info.tuoi <= k) { p = p.next;}
//      return p;
//    }
//       public Node printBytuoi(int x){
//                
//        Node p =search(x);
//        return p;
//    
//    }
        
        
    public boolean saveToFile(String filename)  {
        Node p = null;
        try {
            FileWriter fw = new FileWriter(filename);
            
                PrintWriter pw = new PrintWriter(fw);
            for (int i=0;i<count();i++){ 
                pw.println(get(i).info);
            }
//            while(p!=null){
//                System.out.println(p.info);
//                p=p.next;
//            }
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
        while( p.info.tuoi != x) p = p.next;
        return p;
    }
//    void delAfter(Node q){
//        Node temp= head;
//        //int info= 0 ;
//        while(temp!=null){
//            if(temp.next== q.next)
//                temp.next=temp.next.next;
//        }
//        temp=temp.next;
//    }
     Person delAfter(Node q){
        if(q==tail) {
            return null;
        }
        Person x= q.next.info;
        q.next=q.next.next;
        return x;
    }
          public void sort() 
    {int n = count();
     for (int i = 0; i < n - 1; i++) 
     {for (int j = i + 1; j < n; j++) 
     {Node pi = get(i), pj = get(j);
       if(pi.info.tuoi > pj.info.tuoi) {
        Person t = pi.info; 
        pi.info = pj.info; 
        pj.info = t;}
     }}
    }

    
    //9
//    public Node search(int x){
//        Node p = head;
//        while(p != null && p.info != x) p = p.next;
//        return p;
//    }
    /*
//8
    void delValue(int x){
        Node f,p; f=null;p=head;
        Node q= this.search(x);
        while(p!=null){
            if(p==q) break;
                f=p;p=p.next;
        }
        if(p==null) return;
        if(f==null)
        {
            head=head.next;
            if(head==null) tail=null;
            return;
        }
        f.next=p.next;
        if(f.next==null) tail=f;
    }
    //10
  public int count() 
    {
      Node p = head; int c = 0;
      while(p != null) {c++; p = p.next;}
      return c;
    }
  //11
//   public void delth(int a) 
//    {Node p = null;
//  //   if(p == null) return;
//     //find q where q.next = p
//     Node f = head, q = null;
//     int i=0;
//     while(f != null && i!=a) {q = f; f = f.next;i++;}
//     //remove head
//     if(q == null) {head = head.next;
//     if(head == null) tail = null;
//     }else {
//         q.next = p.next;
//       if(p == tail) tail = q;
//     }
//     p.next = null;
//    }
    public Node get(int k) 
    {Node p = head; int c = 0;
      while(p != null && c < k) {c++; p = p.next;}
      return p;
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
    
    //12
//     public void sort() 
//    {int n = count();
//     for (int i = 0; i < n - 1; i++) 
//     {for (int j = i + 1; j < n; j++) 
//     {Node pi = get(i), pj = get(j);
//       if(pi.info > pj.info) {
//        int t = pi.info; pi.info = pj.info; pj.info = t;}
//     }}
//    }
     //18
      public int max(){
       int max=0; 
       int n = count();
     for (int i = 0; i <= n - 1; i++) 
     {
        
         Node pi = get(i);
       if(i==0){
        max=pi.info;
       }
       if(pi.info > max) {
        max=pi.info;
       }
      }
        return max;
    }
      //19
      public int min(){
     int min=0; 
     int n = count();
     for (int i = 0; i <= n - 1; i++) 
     
     {Node pi = get(i);
     if(i==0){
             min=pi.info;
         }
       if(pi.info < min) {
        min=pi.info;}
     }
        return min;
    }
      //20
    public int sum(){
     int max=0; 
     int n = count();
     for (int i = 0; i <= n - 1; i++) 
     {
         Node pi = get(i);
         max+= pi.info;
    }
     return max;
    }
    //21
    public int avg(){
        //int sum = sum();
        int avg=sum()/count();
        return avg;
    }
    //22
    public boolean issort() 
    {   
        int k;
        boolean is=false;
        for (int i = 0; i <= count() - 1; i++) 
     {
         Node pi = get(0);
         if(pi.info==min()){
             is= true; 
             //break;
         }
         else is = false;
         
        
    }return is;
    }
    //24
    public void reverse(){ 
    
     int n = count();
     for(int i = 0, j = n - 1; i < j; i ++, j --) {
      Node pi = get(i), pj = get(j);
      int t = pi.info; 
      pi.info = pj.info; 
      pj.info = t;}
    }
    */
}
    
    //return the first Node which infor = given x otherwise return null


