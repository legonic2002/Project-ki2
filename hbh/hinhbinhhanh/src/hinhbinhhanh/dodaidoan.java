/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhbinhhanh;

//import static java.lang.Math.pow;
//import static java.lang.Math.sqrt;

/**
 *
 * @author Legon
 */
public class dodaidoan {
    int c1,c2,c3,c4,c5,c6,c7,c8, a1, a2, a3, a4,a5,a6,a7,a8;
 
     public void input(int n1, int n2,int n3, int n4, int n5, int n6, int n7, int n8 ){
      c1=n1;
     c2 = n2;
     c3 =n3;
     c4=n4;
     c5=n5;
     c6=n6;
     c7=n7;
     c8=n8;
     a1=c1-c3;
     a2=c2-c4;
     a3=c3-c5;
     a4=c4-c6;
     a5=c5-c7;
     a6=c6-c8;
     a7=c8-c1;
     a8=c6-c1;
     }   
     double ab=Math.sqrt(Math.pow(5,2) + Math.pow((1),2));
     double bc=Math.sqrt(Math.pow((2),2) + Math.pow((2),2));
     double cd=Math.sqrt(Math.pow((5),2) + Math.pow((1),2));
     double da=Math.sqrt(Math.pow((2),2) + Math.pow((2),2));
     double perimeter,area;
//     public void dodaidoan(){
////         ab=sqrt((c1-c3)*(c1-c3)+(c2-c4)*(c2-c4));
////         bc=sqrt((c3-c5)*(c3-c5)+(c4-c6)*(c4-c8));
////         cd=sqrt((c5-c7)*(c5-c7)+(c6-c8)*(c6-c6));
////         da=sqrt((c8-c2)*(c8-c2)+(c6-c1)*(c6-c1));
////         ab=(double);
////         bc=(double));
////         cd=(double)Math.;
////         da=(double)Math.;  
//    ab=21;
//    bc=12;
//    cd=33;
//    da=44;
//     }
     public void calculateChuVi(){
        perimeter=ab+bc+cd+da;
    }
     double ah=Math.sqrt(65);
    public void calculateDienTich(){
        area=ah*cd*2;               
}
   public void display(){
        System.out.println("AB "+ab+" BC "+bc+" CD "+cd+" DA "+da);
        System.out.println("Perimeter is "+perimeter);
        System.out.println("Area is "+area);
    }
}
    
