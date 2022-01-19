/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int xPrice2 = 0;
        System.out.println();
        System.out.print("Enter title: ");
        final String xTitle = sc.nextLine();
        System.out.print("Enter price: ");
        final int xPrice3 = sc.nextInt();
        sc.nextLine();
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        final Book t = new Book(xTitle, xPrice3);
        if (tc == 2) {
            System.out.print("Enter new price: ");
            xPrice2 = sc.nextInt();
            sc.nextLine();
            t.setPrice(xPrice2);
        }
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1: {
                final String u = t.getTitle();
                System.out.printf("%s\r\n", u);
                break;
            }
            case 2: {
                final int v = t.getPrice();
                System.out.printf("%d\r\n", v);
                break;
            }
            default: {
                return;
            }
        }
        System.out.println();
    }
}
