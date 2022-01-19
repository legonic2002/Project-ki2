/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.inheritance;

/**
 *
 * @author Legon
 */
public class faxnameadd {
    public String name;
    public int fax;
    public String address;

    public faxnameadd() {
        name="dung";
        fax=91723312;
        address="S0 123 duong";
        
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFax() {
        return fax;
    }

    public void setFax(int fax) {
        this.fax = fax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public faxnameadd(String name, int fax, String address) {
        this.name = name;
        this.fax = fax;
        this.address = address;
    }

    @Override
    public String toString() {
        return 
                "Name: " + name+"\n" +
                "Fax: " + fax + "\n"+
                "Address: " + address+"\n";
    }
    
    
    
    
    
    
    
}
