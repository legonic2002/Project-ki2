/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listcsd201;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
public class ListCSD201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                List ops = new ArrayList<String>(
                Arrays.asList(
                        "addToHead(int x) - add a node with value x  at the head of  a list.",
                        "addToTail(int x) - add a node with value x  at the tail of  a list.",
                        "addAfter(Node p, int x) - add a node with value x  after the node p.",
                        "traverse() - traverse from head to tail and dislay info of all nodes in the list.",
                        "deleteFromHead() - delete the head and return its info.",
                        "deleteFromTail() - delete the tail and return its info.",
                        "deleteAter(Node p) - delete the node after the node  p  and return its info.",
                        "dele(int x) - delele the first node whose info is equal to  x.",
                        "search(int x) - search and return the reference to the first node having info x.",
                        "count() - count and return number of nodes in the list.",
                        "dele(int i) - delete an i-th node on the list. Besure that such a node exists.",
                        "sort() - sort the list by ascending order of info.",
                        "dele(Node p) - delete node p if it exists in the list.",
                        "toArray() - create and return array containing info of all nodes in the list.",
                        "two ordered singly linked lists of integers into one ordered list.",
                        "addBefore(Node p, int x) - add a node with value x  before the node p.",
                        "Attach a singly linked list to the end of another singly linked list.",
                        "max() - find and return the maximum value in the list. ",
                        "max() - find and return the maximum value in the list. ",
                        "sum() - return the sum of all values in the list. ",
                        "sum() - return the sum of all values in the list. ",
                        "sorted() - check and return true if the list is sorted, return false if the list is not sorted.",
                        "insert(int x) - insert node with value x into sorted list so that the new list is sorted.",
                        "Reverse a singly linked list using only one pass through the list.",
                        "Check whether two singly linked list have the same contents."
                )
            );
                ListNode node= new ListNode(10);
                Node p = new Node(x);
        int choice = 0;
        Menu menu = new Menu();
        do {
            choice = menu.int_getChoice(ops);
            switch(choice) {
                case 1: options.listBrands();
                        break;
                case 2: options.addBrand(); 
                        break;
                case 3: options.searchBrand(); 
                        break;
                case 4: options.updateBrand();   
                        break;
                case 5: options.saveToFile(brandFileName); 
                        break;
                case 6: options.listCars();  
                        break;
                case 7: options.printbyBrandName(); 
                        break;
                case 8: options.addCar(); 
                        break;
                case 9: options.removeCar(); 
                        break;
                case 10: options.updateCar(); 
                        break;
                case 11:options.saveToFile(carsFile); 
                        break;
                        
                default:System.out.println("Thanks for using!");
            }
        } while (choice>0 && choice<ops.size());
        
    }
        
        
        
        
    }
     public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {val = x;}
 }
}
