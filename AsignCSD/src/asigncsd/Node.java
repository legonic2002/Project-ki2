/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asigncsd;

//import LinkList.Node.Node.*;

/**
 *
 * @author Legon
 */
public class Node {
    Products info;
    Node next;
    Node(Products x){
        info= new Products(x.pcode,x.pname,x.quantity,x.price);
        next=null;
    }
    Node (String pcode, String pname, int quantity, int price){
       info =new  Products(pcode,pname,quantity,price);
        next=null;
    }
}
