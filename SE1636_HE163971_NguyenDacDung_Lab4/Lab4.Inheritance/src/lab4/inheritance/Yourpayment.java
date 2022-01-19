
package lab4.inheritance;


public class Yourpayment  {
    public int number;
    public String service;
    public String unit;
    public int quantity;
    public int unitvalue;
  int[] an=new int[8];
   int c1, i,tong=0 ,sumofpay, VAT,finalpayment;
public Yourpayment(){
    number= 0;
    service="chip vi xu li";
    unit="chiec";
    quantity=0;
    unitvalue=341234;
}
  
  
//    public  Yourpayment(int number, String service, String unit, int quantity, int unitvalue) {
//         if(number==1){
//             a1= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a1);
//        }
//           else if(number==2){
//             a2= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a2);
//        }
//           else if(number==3){
//             a3= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a3);
//        }
//           else if(number==4){
//             a4= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a4);
//        }
//           else if(number==5){
//             a5= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a5);
//        }
//           else if(number==6){
//             a6= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a6);
//        }
//           else if(number==7){
//             a7= unitvalue*quantity;
//            System.out.println(+number+"  "+service+"       "+unit+"  "+unitvalue+"   "+a7);
//        }
//    }
//    public void store(){
//        //c1=a1+a2+a3+a4+a5+a6+a7;
//   sumofpay=a1+a2+a3+a4+a5+a6+a7;
//     VAT=(sumofpay*10)/100;
//     finalpayment=sumofpay+VAT;
//    System.out.println(                
//                "Sum of payment: " + sumofpay + "\n"+
//                "VAT: " + VAT +"\n"+
//                "Finalpayment: " + finalpayment );
//    }

    public  Yourpayment(int number, String service, String unit, int quantity, int unitvalue) {
       c1=quantity*unitvalue;
       if(number==1) System.out.println(+number+"                  "+service+"           "+unit+"      "+quantity+"           "+unitvalue+"             "+c1);
       if(number==2) System.out.println(+number+"                  "+service+"            "+unit+"   "+quantity+"           "+unitvalue+"            "+c1);
       if(number==3) System.out.println(+number+"                  "+service+"       "+unit+"     "+quantity+"           "+unitvalue+"            "+c1);
       if(number==4) System.out.println(+number+"                  "+service+"             "+unit+"   "+quantity+"           "+unitvalue+"            "+c1);
       if(number==5) System.out.println(+number+"                  "+service+"               "+unit+"     "+quantity+"           "+unitvalue+"            "+c1);
       if(number==6) System.out.println(+number+"                  "+service+"           "+unit+"   "+quantity+"           "+unitvalue+"            "+c1);
       if(number==7) System.out.println(+number+"                  "+service+"          "+unit+"   "+quantity+"           "+unitvalue+"             "+c1);
      // System.out.println(+number+"                  "+service+"  "+unit+"   "+quantity+"            "+unitvalue+"         "+c1);
    }
    


  public int store2(){
      return c1;

    }
}


    
 
    

