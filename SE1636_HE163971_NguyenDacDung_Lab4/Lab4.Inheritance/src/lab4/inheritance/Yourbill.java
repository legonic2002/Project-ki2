/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.inheritance;

/**
 *
 * @author Legon
 */
public class Yourbill {

   
    public static void main(String[] args) {
int[] bn= new int[80];
int i,tong=0,VAT,finalpay;
//int[] an=new int[8];
        Sender p1 = new Sender("CONG TY CO PHAN MAY TINH", 100921861, "So 241, Pho Vong", "098172316","0330199023");
    //    p1= new Sender("CONG TY CO PHAN MAY TINH", 100921861, "So 241, Pho Vong", "098172316","0330199023");
                System.out.println("Sender\n\n"+p1);
                
                
       Billto p2=new Billto("DICH VU BAO MAT SIEU CAP", 1234452, "So 153 thanh pho Ho Chi Minh","InternetBanking");
   //    p2= new Billto("DICH VU BAO MAT SIEU CAP", 1234452, "So 153 thanh pho Ho Chi Minh","money transfer");
       System.out.println("Bill to \n\n"+p2);
 //    Yourpayment p3=new Yourpayment();
 
 
 System.out.println("Number of item     Item                      Unit    Quantity    Unitvalue          Totalvalue");
     Yourpayment p3=new Yourpayment(1, "Quạt tản nhiệt", " Bộ", 4, 467120);
     bn[1]=p3.store2();
      p3=new Yourpayment(2, "Chip vi xu li", " Chiếc", 4, 2200000);
     bn[2]=p3.store2();
      p3=new Yourpayment(3, "Mạch in đã lắp ráp", " Tấm", 1, 1554000);
     bn[3]=p3.store2();
      p3=new Yourpayment(4, "Bộ nhớ trong", " Chiếc", 2, 1113456);
     bn[4]=p3.store2();
      p3=new Yourpayment(5, "Ổ cứng SSD", " Cái", 1, 1133444);
     bn[5]=p3.store2();
      p3=new Yourpayment(6, "Nguồn máy tính", " Chiếc", 3, 1893332);
     bn[6]=p3.store2();
      p3=new Yourpayment(7, "Vỏ cây máy tính", " Chiếc", 1, 552000);
     bn[7]=p3.store2();
     for(i=1;i<8;i++){
         tong+=bn[i];
     }
    VAT=(tong*10)/100;
    finalpay= tong+VAT;
     System.out.println(
     "Yourpay: "+tong+"\n"+
     "VAT: "+VAT+"\n"+
     "Finalpayment: "+finalpay
     );
     
     
    }
    
    
}
