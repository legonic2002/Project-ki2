/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;


/**
 *
 * @author Legon
 */
public class tuan22buoi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arInt2[]={5,6,7,3};
System.out.println("Number of element if arrInt "+arInt2.length); 
// TODO code application logic here
for(int i = 0;i<arInt2.length;i++ ){
        System.out.println(+ arInt2[i]));
    }
char[] copyFrom = {'d','e','c','z','v','a','z','q','h','i'};
char[] copyTo = new char[10];
System.arraycopy(copyFrom, 2, copyTo, 0, 8);
System.out.println(new String(copyTo));
//int
for(int j=0;j<copyTo.length;j++){
    System.out.println("The element "+j+ " is "+copyTo[j]);
}
String studentID="SE163971";
for(int k=0;k<studentID.length();k++){
System.out.println(+k+":"+studentID.charAt(k));
    }
char[] a= studentID.toCharArray();
for(int k=0;k<studentID.length();k++){
    System.out.println(j+":"+a.charAt(k))

    }
    public void testScope(){
        
    }

    
    
    
    }

