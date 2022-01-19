package loc100.j1.s.h203;
import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {
    Scanner sa= new Scanner(System.in);//de nhap tu can tim
    ArrayList<String> list = new ArrayList();//them vao list tu stringtokenizer
    ArrayList<String> list3 =  new ArrayList();
    String[] temp= new String[100];//luu tam de viec in ra co the them ". "
    public Reverse(String rever) {
        
        while(rever.isEmpty()){
            System.err.println("It is empty. Please input again");
            rever=sa.nextLine();
        }
        StringTokenizer stk= new StringTokenizer(rever,".");
        while(stk.hasMoreTokens()){
            list.add(stk.nextToken().trim());     
        }
        int p=0;
        for(int i=0;i<list.size();i++){
            StringTokenizer stk2= new StringTokenizer(list.get(i)," ");
            ArrayList<String> list2 = new ArrayList();
            while(stk2.hasMoreTokens()){
            list2.add(stk2.nextToken().trim());     
        }
            Collections.reverse(list2);
            int k=0;
            String m = "" ;
           for(k=0;k<list2.size();k++){
              m =  m.concat(" "+list2.get(k));   
            }
            list3.add(m.trim());
            list2.clear();
        }
        char old;
        System.out.println("\nYour String after reverse:");
        for(int i=list3.size()-1;i>=0;i--){
            
            old= list3.get(i).charAt(0);
            old=Character.toUpperCase(old);
            //use stringbuilder de thay doi ki tu cua string
            StringBuilder myName = new StringBuilder(list3.get(i));
                    myName.setCharAt(0,old);
                    //cho string vao day string trung gian de in ra 
            temp[i] = myName.toString();  
//            temp[i].charAt(i)
            if(i==0) System.out.print(temp[i]);
            else System.out.print(temp[i]+" . ");
        }
        System.out.println();
         
    }
    
}
