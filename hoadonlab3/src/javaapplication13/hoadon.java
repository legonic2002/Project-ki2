/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Legon
 */
public class hoadon {
    int count=0,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0;
    int b1=0,b2=0,b3=0,b4=0,b5=0,b6=0,b7=0,b8=0,b9=0,b10=0;
    int c, c2, c3;
    public void mucthanhtoan(String s, int i){
        if("KOMBUCHA LYCHEE".equals(s)) {
            count=i;
            a1=count*105000;
            System.out.println(+count+"  "+s+"    "+ a1);
        }
        if("GOOD KARMA".equals(s)) {
            count=i;
            a2=count*120000;
             System.out.println(+count+"  "+s+"    "+ a2);
        }
        if("BANANA BENJI".equals(s)) {
            count=i;
            a3=count*95000;
             System.out.println(+count+"  "+s+"     "+ a3);
        }
        if("ICE LATE".equals(s)) {
            count=i;
            a4=count*95000;
            System.out.println(+count+"  "+s+"     "+ a4);
        }
        if("CHOCOLATE".equals(s)) {
            count=i;
            a5=count*85000;
              System.out.println(+count+"  "+s+"     "+ a5);
        }
        if("SALTED CARAMEL CHIFON CA".equals(s)) {
            count=i;
            a6=count*180000;
            System.out.println(+count+"  "+s+"     "+ a6);
        }
        if("CHOCOLATE CHIFON CAKE".equals(s)) {
            count=i;
            a7=count*180000;
             System.out.println(+count+"  "+s+"     "+ a7);
        }
        if("ESPRESSO TIRAMISU".equals(s)) {
            count=i;
            a8=count*140000;
            System.out.println(+count+"  "+s+"     "+ a8);
        }
        if("Surcharge 10%".equals(s)) {
            count=i;
            a9=count*112000;
            System.out.println(+count+"  "+s+"     "+ a9);
        }
        if("MILK".equals(s)) {
            count=i;
            a10=count*69000;
            System.out.println(+count+"  "+s+"     "+ a10);
        }
    }
    public void muctinhthue(String s, int i){
        if("KOMBUCHA LYCHEE".equals(s)) {
            count=i;
            b1=(count*105000*5)/100;
            System.out.println("Tien thue "+ b1);
        }
        if("GOOD KARMA".equals(s)) {
            count=i;
            b2=(count*120000*3)/100;
                System.out.println("Tien thue "+ b2);
        }
        if("BANANA BENJI".equals(s)) {
            count=i;
            b3=(count*95000*9)/100;
                System.out.println("Tien thue "+ b3);
        }
        if("ICE LATE".equals(s)) {
            count=i;
            b4=(count*95000*1)/100;
                System.out.println("Tien thue "+ b4);
        }
        if("CHOCOLATE".equals(s)) {
            count=i;
            b5=(count*85000*2)/100;
                System.out.println("Tien thue "+ b5);
        }
        if("SALTED CARAMEL CHIFON CA".equals(s)) {
            count=i;
            b6=(count*180000*3)/100;
                System.out.println("Tien thue "+ b6);
        }
        if("CHOCOLATE CHIFON CAKE".equals(s)) {
            count=i;
            b7=(count*180000*4)/100;
                System.out.println("Tien thue "+ b7);
        }
        if("ESPRESSO TIRAMISU".equals(s)) {
            count=i;
            b8=(count*140000*1)/100;
                System.out.println("Tien thue "+ b8);
        }
        if("Surcharge 10%".equals(s)) {
            count=i;
            b9=(count*112000*2)/100;
                System.out.println("Tien thue "+ b9);
        }
        if("MILK".equals(s)) {
            count=i;
            b10=(count*69000*3)/100;
                System.out.println("Tien thue "+ b10);
        }
    }
    public void muctongtien(){
        c=a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        c2=b1+b2+b3+b4+b5+b6+b7+b8+b9+b10;
        c3=c+c2;
        System.out.println("Thanh toan: "+c);
        System.out.println("Thue: "+c2);
        System.out.println("Thanh tien: "+c3);
    }
}
