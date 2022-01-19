/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;
// 
/**
 *
 * @author Legon
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Quan  Description    Cost     ");
        hoadon d=new hoadon();
        
        d.mucthanhtoan("KOMBUCHA LYCHEE",1);
        d.muctinhthue("KOMBUCHA LYCHEE", 1);
        
        d.mucthanhtoan("GOOD KARMA" , 2);
        d.muctinhthue("GOOD KARMA" , 2);
        
        d.mucthanhtoan("BANANA BENJI", 1);
        d.muctinhthue("BANANA BENJI", 1);
        
        d.mucthanhtoan("ICE LATE", 1);
        d.muctinhthue("ICE LATE", 1);
        
        d.mucthanhtoan("CHOCOLATE", 1);
        d.muctinhthue("CHOCOLATE", 1);
        
        d.mucthanhtoan("SALTED CARAMEL CHIFON CA", 1);
        d.muctinhthue("SALTED CARAMEL CHIFON CA", 1);
        
        d.mucthanhtoan("CHOCOLATE CHIFON CAKE", 1);
        d.muctinhthue("CHOCOLATE CHIFON CAKE", 1);
        
        d.mucthanhtoan("ESPRESSO TIRAMISU", 1);
        d.muctinhthue("ESPRESSO TIRAMISU", 1);
        
        d.mucthanhtoan("Surcharge 10%", 1);
        d.muctinhthue("Surcharge 10%", 1);
        
       d.mucthanhtoan("MILK", 1);
       d.muctinhthue("MILK", 1);
               
       System.out.println("============================== ");
         d.muctongtien();                
                
}
}
