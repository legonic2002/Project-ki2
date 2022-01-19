/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrelop;

/**
 *
 * @author Legon
 */
public class Calculate {
    Point center;
    double radius,a;
    double perimeter;
    double area;
    public void inputData(double n){
     a=n;
    }
    public void CalculatPimeter(){
         perimeter=a*2*3.14;
    }
    public void CalculateArean(){
         area=a*a*3.14;
    }
    public void display(){
        System.out.println("Perimeter is "+perimeter);
        System.out.println("Area is "+area);
    }
}
