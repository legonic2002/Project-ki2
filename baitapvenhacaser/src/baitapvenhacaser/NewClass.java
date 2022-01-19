/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitapvenhacaser;

/**
 *
 * @author Legon
 */
public class NewClass {
    public static void main(String[] args){
    Baitapvenhacaser quanlenh1= new Baitapvenhacaser("toi nay dai quan danh chiem thanh nha ha luc 22:15");
    quanlenh1.setKey(7);
    String plaintext = quanlenh1.emcrypt();
    System.out.println("Noi dung quan lenh da ma hoa: "+plaintext);
    
    String original = new Baitapvenhacaser.decrypt
    System.out.println("Noi dung cau lenh sau khi duoc giai ma"+original);
}
}
