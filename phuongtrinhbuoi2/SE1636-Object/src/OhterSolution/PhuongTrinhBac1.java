/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OhterSolution;

import java.util.Scanner;

/**
 *
 * @author Legon
 */
public class PhuongTrinhBac1 {
  double b, c;
  Scanner sc;
  public void input(){
       sc = new Scanner(System.in);
      System.out.println("Input a: ");
      b=sc.nextDouble();
      System.out.println("input b: ");
      c=sc.nextDouble();
  }
  public void solve(){
      if(b==0)
          if(c==0)System.out.println("Expression"+b+"x +" +c+"has unlimted solution");
      else System.out.println("Expression"+b+"x +" +c+"has no solution");
      else System.out.println("Expression"+b+"x +" +c+"has one solution"+-c/b);
  }
    
}
