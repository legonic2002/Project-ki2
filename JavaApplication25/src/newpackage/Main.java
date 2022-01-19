/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter maker: ");
        final String xMaker = sc.nextLine();
        System.out.print("Enter price: ");
        final int xPrice = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter type: ");
        final int xType = sc.nextInt();
        sc.nextLine();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Test getValue()");
        System.out.print("Enter TC (1,2,3): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        System.out.println("OUTPUT:");
        switch (tc) {
            case 1: {
//                Car a11 = new Car(xMaker, xPrice);
                Car all = new Car(xMaker, xPrice);
                System.out.println(all);
                Car a12 = new SpecCar(xMaker, xPrice, xType);
                System.out.println(a12);
                break;
            }
            case 2: {
                final SpecCar b2 = new SpecCar(xMaker, xPrice, xType);
                b2.setData();
                final String v2 = b2.getMaker();
                final int k2 = b2.getPrice();
                System.out.printf("%s, %d\n", v2, k2);
                break;
            }
            case 3: {
                final SpecCar b3 = new SpecCar(xMaker, xPrice, xType);
                final int v3 = b3.getValue();
                System.out.printf("%d\n", v3);
                break;
            }
        }
        System.out.println();
    }
}
