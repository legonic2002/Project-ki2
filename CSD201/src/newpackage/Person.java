/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Legon
 */
public class Person {
    String name;
    int tuoi;

     public Person(String name, int tuoi) {
        this.name = name;
        this.tuoi = tuoi;
    }

//    person(String a, int i) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString() {
        return   name + "," + tuoi  ;
    }
    
    
    
    
}
