/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///bai tap cua sih vien Nguyen Dac Dung
package baitaptrelop;

/**
 *
 * @author Legon
 */
public class HinhTron1 {

    public static void main(String[] args) {
        Point p1 = new Point(5,50);
        System.out.println(p1);      
           Calculate p2 = new Calculate();
           
           p2.inputData(5.3);
           p2.CalculatPimeter();
           p2.CalculateArean();
           p2.display();
           
           p2.inputData(88.2);
           p2.CalculatPimeter();
           p2.CalculateArean();
           p2.display();
                
                
                
    }
    
}
