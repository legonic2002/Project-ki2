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
public class Main {
    public static void main(String[] args) {
        int x,y,z;
        x=3;
        y=5;
        z=2;
        
        Stack s =new Stack();
        s.makeEmpty( );
        s.push(x);s.push(4);s.pop();
        s.push(y);s.push(3); s.push(z);
        s.pop();s.push(2);s.push(x);
        while(! s.isEmpty( )) System.out.println(s.pop() + "  ");
                x = 3; y = 1;
                System.out.println("");
        s.makeEmpty();
        s.push(5);s.push(7);s.pop();
        x += y;
        s.pop();
        s.push(x);s.push(y); s.push(2);s.pop();s.pop();
        while (! s.isEmpty( ))
        {
            y = (int) s.pop();
            System.out.println(y);
            }
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            
            s.makeEmpty();
//            s.push("*"); s.push("*"); s.push("*");s.push("N"); s.push("*"); 
//            s.push("O"); s.push("I"); s.push("*");s.push("T"); s.push("S");
//            s.push("*"); s.push("*");  s.push("E");   s.push("U");s.push("Q");
//            s.push("*");
//            s.push("Y");s.push("*");  s.push("S"); s.push("A");s.push("E");
           //            
//           
//            
//            
//           
             s.push("E"); s.push("A");s.push("S");s.pop();   s.push("Y");
             s.push("Q");s.push("U"); s.push("E");  s.pop(); s.pop();
             s.push("S");s.push("T"); s.pop();s.push("I");  s.push("O"); 
             s.pop(); s.push("N"); s.pop();s.pop(); s.pop();

//s.pop();



              //while(! s.isEmpty( )) System.out.print(s.pop() + "  ");
              s.traverse();
    }
}
