/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0102;
import java.lang.*;
import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Check {
    public String Check(String day) throws ParseException {
//        int a= check1(day);
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList();
        Date date=new Date();
        String dayofweek= "";  
       while(isValid(day)==false&& check1(day)==false){
           if(isValid(day)==false){
           System.out.println("Your input is wrong format dd/M/yyyy and don't have negative number:");
           day=sc.nextLine();
           }
           if(check1(day)==false){
           System.out.println("Your day you input not exist yet please input again :");
           day=sc.nextLine();
           }
       }
        
       
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        Date dayWeekText = new SimpleDateFormat("dd/M/yyyy").parse(day);
        dayofweek=dayWeekText.toString();
        StringTokenizer stk= new StringTokenizer(dayofweek," ");
        while(stk.hasMoreTokens()){
            list.add(stk.nextToken());     
        }   //System.out.println("Day of week in text:"+dayWeekText);
        if(list.get(0).contains("Mo")) System.out.println("Monday");
        if(list.get(0).contains("Tu")) System.out.println("Tuesday");
        if(list.get(0).contains("We")) System.out.println("Wednesday");
        if(list.get(0).contains("Th")) System.out.println("Thursday");
        if(list.get(0).contains("Fr")) System.out.println("Friday");
        if(list.get(0).contains("Sa")) System.out.println("Saturday");
        if(list.get(0).contains("Su")) System.out.println("Sunday");
       
        return dayofweek;
    //      System.out.println("Day of week in number:"+dayOfWeek);
      //  String dayWeekText = new SimpleDateFormat("EEEE").format(date);      
             
//        for(int i = 0 ;i<list.size();i++){
//            if(list.get(0)=="Mon"){
//                System.out.println("Monday");
//                break;
//            }
//            //System.out.println(list.get(0).toString());
//       }
//        SimpleDateFormat format1=new SimpleDateFormat("MM/dd/yyyy");
//      Date dt1=format1.parse(day);
//      DateFormat format2=new SimpleDateFormat("EEEE"); 
//      format2.setLenient(false);
//      format2.parse("12/12/1988");
//      String finalDay=format2.format(dt1);
    }
    public boolean check1(String day){
        List<String> list1 = new ArrayList();
        Scanner sc = new Scanner(System.in);
        boolean  flag=true;
        int a1,a2,a3;
        //    String a1,a2,a3;
  
        while(flag=false){
            StringTokenizer stk1= new StringTokenizer(day,"/");
              while(stk1.hasMoreTokens()){
            list1.add(stk1.nextToken());     
            }
              a1=Integer.parseInt(list1.get(0));
              a2=Integer.parseInt(list1.get(1));
              a3=Integer.parseInt(list1.get(2));
            if(a3>2022 ){
                flag=false;
            }
            if (a2>1 ){
                    flag=false;
                }
            if(a1>18){
                        flag=false;
                    }
                   // else flag=0;
            if(flag==false){
                day=sc.nextLine();
            } 
        }return flag; 
}
    public boolean isValid(String day) {
        DateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(day);
        } catch (ParseException e) {
            return false;
        }
        
        
        return true;
    }
}
