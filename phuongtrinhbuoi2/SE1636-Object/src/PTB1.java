
import static java.lang.Math.sqrt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Legon
 */
public class PTB1 {
    double a,c,b;
    String result, result2;
    public void inputData(double n1, double n2, double n3){
        a=n1;
        b=n2;
        c=n3;
        //Scanner; neu muon nhap tu ban phim
    }
    public void inputData2(double n1, double n2){
        a=n1;
        b=n2;
    }
    public void processData2(){
        if(a==0)
            if(b==0) result2= "Phuong trinh vo nghiem";
            else result2="Phuong trinh vo so nghiem";
        else result2="phuong trinh co nghiem duy nhat "+-b/a;
    }
    public void processData(){
    double del=b*b-4*a*c;

    {if(a==0){
        PTB1 pt1 = new PTB1();
        pt1.inputData2( b, c);
        pt1.processData2();
 //       pt1.displaayData();
    }
    else{
        double delt=b*b-4*a*c;
        double d = Math.sqrt(delt);
        if(delt>0){
            result = "Phuong tring co 2 nghiem phan biet ";
                 double x1=(-b-delt)/2*a;
                 double x2=(-b+delt)/2*a;
                 result +="\n x1 ="+x1;
                 result +="\n x2 ="+x2;
        }
        
    }
    }
    }
    public void displaayData(){
        System.out.println(result);
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
           if(b==0)
           if(c==0)System.out.println("Phuong trinh vo so nghiem");
               else{
                   if(0==del)System.out.println("Phuong trinh co 1 nghiem "+-b/2*a);
                   if(del>0) System.out.println("Phuong trinh co 2 nghiem phan biet "+(-b-sqrt(del))/2*a +(-b+sqrt(del))/2*a);
                   if(del<0)System.out.println("Phuong trinh vo nghiem");
               }        
           else if(c==0)System.out.println("Phuong trinh co nghiem 0");}
           if(a==0&&b==0&&c!=0) System.out.println("Phuong trinh vo nghiem");
           if(a!=0&&b==0&&c!=0){
           if(c>0&&a>0)System.out.println("Phuong trinh vo nghiem");
           if(c>0&&a<0)System.out.println("Phuong trinh co 2 nghiem "+sqrt(-c/a)+-sqrt(-c/a));
           if(c<0&&a>0)System.out.println("Phuong trinh co 2 nghiem "+sqrt(-c/a)+-sqrt(-c/a));
           if(c<0&&a<0)System.out.println("Phuont trinh vo nghiem");
       }
           else if(a!=0&&b!=0) System.out.println("Phuong trinh co 2 nghiem la 0 "+-b/a);
       else if(a!=0)System.out.println("Phuong trinh co nghiem bang 0");

    }
    public void displayData(){
            processData();
        }

    private void inputData(double b, double c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
