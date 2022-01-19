/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Bai Tap cua Sinh vien Nguyen Dac Dung
package baitaptrenlophinhchunhat;

/**
 *
 * @author Legon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       //line p1;
 //      line p1;
      line p4 = new line(new Point(3, 8), new Point(10,30));
       System.out.println(p4);
    
     Calculate p2 = new Calculate();
     p2.input(10, 20);
     p2.calculateChuVi();
     p2.calculateDienTich();
     p2.display();
     
     p2.input(3.1, 10.4);
     p2.calculateChuVi();
     p2.calculateDienTich();
     p2.display();
    }   
}
