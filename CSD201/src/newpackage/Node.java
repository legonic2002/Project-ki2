/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

//import LinkList.Node.Node.*;

/**
 *
 * @author Legon
 */
public class Node {
    Person info;
    Node next;
    Node(Person x){
        info= new Person(x.name,x.tuoi);
        next=null;
    }
    Node (String name, int tuoi){
        info =  new Person(name,tuoi);
        next=null;
    }
}
