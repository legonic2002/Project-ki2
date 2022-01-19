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
public class Sender extends faxnameadd {
    public String phone;
    public String accountnumber;

    public Sender() {
        phone="0991273127";
        accountnumber="So 123 duong";
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public Sender(String name, int fax, String address,String phone, String accountnumber ) {
        super(name, fax, address);
        this.phone = phone;
        this.accountnumber = accountnumber;
    }

 

    @Override
    public String toString() {
        return 
               super.toString()+
               "Phone: " + phone + "\n"+
               "Accountnumber: " + accountnumber  +"\n"+
                "===============================================================";
               
    }
    
    
    
    
    
}
