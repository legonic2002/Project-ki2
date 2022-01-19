/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inhoachudau;

/**
 *
 * @author Legon
 */
import java.util.Scanner;
class Part3 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Nhap so luong:");
     int n = sc.nextInt();
     String[] arr = new String[n];
     String[] arr2 = new String[n];
     Scanner sb = new Scanner(System.in);
     for (int i = 0; i < n; i++) {
            System.out.printf("Hoc sinh thu %d: ", i);
            arr[i] = sb.nextLine();
     }
     char old;
          for(int i=0;i<n;i++){
              old= arr[i].charAt(0);
            old=Character.toUpperCase(old);
            //use stringbuilder de thay doi ki tu cua string
            StringBuilder myName = new StringBuilder(arr[i]);
                    myName.setCharAt(0,old);
                    arr2[i]=myName.toString();
                    System.out.println(arr2[i]);
          }  
  }
}
