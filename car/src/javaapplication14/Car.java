/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

/**
 *
 * @author Legon
 */
public class Car {
private String colour;
private int EnginePower;
private boolean Covertible;
private boolean parkingBrake;
   public void pressStartButton(){
       System.out.println("You can press the start button");
   }
   public MyCar(){
     colour = "white";
      EnginePower= 100;
      Covertible= false;
      parkingBrake= true;
   }
   public Mycar(String s){
       this();
       colour= s;   
   }
   public MyCar(String b, int Enginer, boolean ParkingBrake){
       
   }
   
   public void PressAcceleratorButton(){
       System.out.println("You can press the accelerator button");
       System.out.println("Colour: "+colour);
       System.out.println("Engine power: "+EnginePower);
       System.out.println("Covertible: "+Covertible);
       System.out.println("Packing brake: "+parkingBrake);
   }
    public static void main(String[] args) {
        Car c=new Car();
        c.pressStartButton();
        c.PressAcceleratorButton();
        
        MyCar c2=new MyCar("red");
      //  c.pressStartButton();
        c2.PressAcceleratorButton();
        
//         Mycar c3=StartButton();
//        c3.PressAcceleratorButton();

    }
  
    
}
