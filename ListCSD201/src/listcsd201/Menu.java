/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listcsd201;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Legon
 */
class Menu {
        public <E> int int_getChoice(ArrayList<E> options) {
        Scanner sc = new Scanner(System.in);
        int response = 0, n = options.size();
        for (int i=0;i<n;i++) {
            System.out.println(i+1+" : "+options.get(i));
        }
        System.out.print("Please choose an option from 1 to " +n+ " (1..."+n+"): ");
        response = sc.nextInt();
        return response;
    }
    public <E> E ref_getChoice(ArrayList<E> options) {
        Scanner sc = new Scanner(System.in);
        
        int response = 0;
        int n = options.size();
        
        do {
            response = int_getChoice(options);
        } while (response<=0||response>n);
        return options.get(response-1);
    }
}
