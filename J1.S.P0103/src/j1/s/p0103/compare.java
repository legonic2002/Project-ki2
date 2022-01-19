/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
public class compare {
        public boolean isValid(String day) {
        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        try {
            sdf.parse(day);
        } catch (ParseException e) {
            return false;
        }
        
        
        return true;
    }
        public void Check(String day, String day2) throws ParseException{
           SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      //Date date1 = sdf.parse("2009-12-31");
      Date date1 = sdf.parse(day);
      Date date2 = sdf.parse(day2);

      System.out.println("date1 : " + sdf.format(date1));
      System.out.println("date2 : " + sdf.format(date2));

      if (date1.equals(date2)) {
          System.out.println("Date1 is equal Date2");
      }

      if (date1.after(date2)) {
          System.out.println("Date1 is after Date2");
      }

      if (date1.before(date2)) {
          System.out.println("Date1 is before Date2");
      }

                         // return result;
        }
//        public String Check(String day, String day2){
//            String result= "No result";
//            int a1,a2,a3;
//            List<String> list1 = new ArrayList();
//            StringTokenizer stk1= new StringTokenizer(day,"/");
//              while(stk1.hasMoreTokens()){
//            list1.add(stk1.nextToken());     
//            }
//              a1=Integer.parseInt(list1.get(0));
//              a2=Integer.parseInt(list1.get(1));
//              a3=Integer.parseInt(list1.get(2));
//        int b1,b2,b3;
//       List<String> list2 = new ArrayList();
//            StringTokenizer stk2= new StringTokenizer(day2,"/");
//              while(stk1.hasMoreTokens()){
//            list1.add(stk1.nextToken());     
//            }
//              b1=Integer.parseInt(list1.get(0));
//              b2=Integer.parseInt(list1.get(1));
//              b3=Integer.parseInt(list1.get(2));
//              
//              if(b3>a3)result= "day2 after day1";    
//              else if(b3<a3) result="day2 before day1";     
//              else if(b3==a3){
//                  if(b2>a2) result= "day2 after day1";
//                  else if(b2<a2) result="day2 before day1";
//                  else if(b2==a2){ 
//                      if(b1>a1) result= "day2 after day1";
//                      else if(b1<a1) result="day2 before day1";     
//                      else if(b1==a1) System.out.println("day2 and day 1 is the same day");
//                  }
//                  
//              }
//              return result;
//        }
}
