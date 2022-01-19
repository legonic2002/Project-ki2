/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitaptrenlophinhchunhat;

/**
 *
 * @author Legon
 */
public class Calculate {
//    line lenght, wid;
    double dai, rong, perimeter, area;
    public void input(double n1, double n2){
        dai=n1;
        rong=n2;
    }
    public void calculateChuVi(){
        perimeter=(dai+rong)*2;
    }
    public void calculateDienTich(){
        area=dai*rong;
    }
    public void display(){
        System.out.println("Perimeter is "+perimeter);
        System.out.println("Area is "+area);
    }
}
