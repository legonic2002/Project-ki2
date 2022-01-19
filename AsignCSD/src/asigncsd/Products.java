/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigncsd;

/**
 *
 * @author Legon
 */
public class Products {
    String pcode;
    String pname;
    int quantity; 
            double price;

    public Products(String pcode, String pname, int quantity, double price) {
        this.pcode = pcode;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
    }
    

   

//    person(String a, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString() {
        return  pcode + " | " + pname + " | " + quantity + " | " + price ;
    }

 
    
    
    
    
}
