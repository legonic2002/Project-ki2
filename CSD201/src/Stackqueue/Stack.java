/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stackqueue;

/**
 *
 * @author Legon
 */
public class Stack {
     Node head;

    public Stack() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void push(Object info) 
    {
        Node p = new Node(info);
     if(isEmpty()) head = p;
     else {p.next = head; head = p;}
    }
    
    public Object pop() 
    {
        if(isEmpty()) return null;
     Object info = head.info;
     head = head.next;
     return info;
    }
    
    public Object top() 
    {
        if(isEmpty()) return null;
     Object info = head.info;
     return info;
    }
    
    public void makeEmpty( ) {
        head = null;
    }
    public void traverse(){
        Node p =head;
        while(p !=null){
            System.out.print(p.info);
            if(p.next!=null){
                System.out.print(" ");
            
            }
            p= p.next;
                    
        }
        System.out.println();
    }
}
