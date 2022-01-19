/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkList.Node.Node;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
import newpackage.Person;

/**
 *
 * @author Legon
 */
public class MyList {
    Node head;
    Node tail;
    
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
    void addFirst(int x){
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
        while(p !=null){
            System.out.print(p.info);
            if(p.next!=null){
                System.out.print("-");
            
            }
            p= p.next;
                    
        }
        System.out.println();
    }
    //2
    void addLast(int x){
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
    //9
    public Node search(int x){
        Node p = head;
        while(p != null && p.info != x) p = p.next;
        return p;
    }
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
    {
        Node p = head; int c = 0;
      while(p != null && c < k) {
          c++; p = p.next;}
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
    
    void addAfter(Node p, int x){
        Node q = new Node(x);
        q.next= p.next;
        p.next= q;
    }
        int delAfter(Node q){
        if(q==tail){
            return 0;
        }
        int x;
        x = q.next.info;
        q.next= q.next.next;
        return x;
    }
    //12
     public void sort() 
    {int n = count();
     for (int i = 0; i < n - 1; i++) 
     {for (int j = i + 1; j < n; j++) 
     {Node pi = get(i), pj = get(j);
       if(pi.info > pj.info) {
        int t = pi.info; pi.info = pj.info; pj.info = t;}
     }}
    }
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
}
    
    //return the first Node which infor = given x otherwise return null


