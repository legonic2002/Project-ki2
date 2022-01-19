/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//5,0;10,1;12,3;7,2;ab-bc-cd-da
package hinhbinhhanh;

/**
 *
 * @author Legon
 */
public class Hinhbinhhanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Point2 p4= new Point2(new Point(5,0), new Point(10,1), new Point(12,3),new Point(7,2));
       System.out.println(p4);
       dodaidoan p2= new dodaidoan();
       p2.input(5, 0, 10, 1, 12, 3, 7, 2);
       p2.calculateChuVi();
       p2.calculateDienTich();
       p2.display();
    }
     
     
}
