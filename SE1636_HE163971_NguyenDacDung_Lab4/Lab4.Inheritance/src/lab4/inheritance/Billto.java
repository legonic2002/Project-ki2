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
public class Billto extends faxnameadd {
    public String paymethod;

    public Billto() {
        paymethod=" Chuyen khoan";
    }



    public String getPaymethod() {
        return paymethod;
    }

    public void setPaymethod(String paymethod) {
        this.paymethod = paymethod;
    }

    public Billto(String name, int fax, String address,String paymethod) {
        super(name, fax, address);
        this.paymethod = paymethod;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Paymethod: " + paymethod + "\n"+
                "===============================================================";
    }


}
