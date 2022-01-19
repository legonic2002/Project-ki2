/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage1;

/**
 *
 * @author Legon
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

// 
// Decompiled by Procyon v0.5.36
// 

public class Main
{
    public static void dispList(final List<Car> t) {
        for (final Car x : t) {
            System.out.printf("(%s,%d) ", x.getMaker(), x.getRate());
        }
        System.out.printf("\r\n", new Object[0]);
    }
    
    public static void addToList(final List<Car> t, final String[] a, final int[] b) {
        for (int n = a.length, i = 0; i < n; ++i) {
            t.add(new Car(a[i], b[i]));
        }
    }
    
    public static void main(final String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        final List<Car> t = new ArrayList<Car>();
        final String[] a1 = { "A", "B", "C", "D", "E" };
        final int[] b1 = { 3, 7, 6, 7, 6 };
        final String[] a2 = { "A", "B", "C", "D", "E", "F", "G" };
        final int[] b2 = { 6, 2, 9, 17, 8, 17, 2 };
        final String[] a3 = { "H", "G", "E", "F", "E", "C", "B", "A" };
        final int[] b3 = { 1, 2, 3, 4, 15, 6, 7, 8 };
        System.out.print("Add how many elements: ");
        final int n = sc.nextInt();
        sc.nextLine();
        String xMaker = "";
        int xRate = 0;
        for (int i = 0; i < n; ++i) {
            System.out.print("Enter maker: ");
            xMaker = sc.nextLine();
            System.out.print("Enter rate: ");
            xRate = sc.nextInt();
            sc.nextLine();
            t.add(new Car(xMaker, xRate));
        }
        System.out.print("Enter TC(1-f1;2-f2;3-f3): ");
        final int tc = sc.nextInt();
        sc.nextLine();
        final ICar u = (ICar)new MyCar();
        switch (tc) {
            case 1: {
                addToList(t, a1, b1);
                System.out.println("The list before running f1:");
                dispList(t);
                break;
            }
            case 2: {
                addToList(t, a2, b2);
                System.out.println("The list before running f2:");
                dispList(t);
                break;
            }
            case 3: {
                addToList(t, a3, b3);
                System.out.println("The list before running f3:");
                dispList(t);
                break;
            }
        }
        System.out.printf("OUTPUT:\r\n", new Object[0]);
        switch (tc) {
            case 1: {
                final int count = u.f1((List)t);
                System.out.printf("%d\r\n", count);
                break;
            }
            case 2: {
                u.f2((List)t);
                dispList(t);
                break;
            }
            case 3: {
                u.f3((List)t);
                dispList(t);
                break;
            }
        }
        System.out.println();
    }
}
