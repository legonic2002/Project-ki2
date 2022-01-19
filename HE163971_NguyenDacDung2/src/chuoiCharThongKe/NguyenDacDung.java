package javaapplication10;


import java.util.Scanner;


public class NguyenDacDung {
        String content="";
        int vowel[]={'a','e','i','o','u'};
        int vowelFregs[]={0};

        public NguyenDacDung(){}
        public NguyenDacDung(String s) {content = s;}
public String getContent(){
    return content;
}

 public void setContent(String content){
     this.content = content;
 }


//    public void inputData(){
//       Scanner sc= new Scanner(System.in);
//        int limit=10;
////        int c1=0, c2=0, c3=0, c4=0, c5=0;
////       System.out.println("Plrase input a string( limit "+ limit +" charecters)");
////       System.out.println("input");
////       String input = sc.nextLine(); 
////       int n=input.length();
////       if(n>limit)
////           content = input.substring(0, limit);  
////     
////      String arr[] = new String[n];
////       for(int i=0;i<n;i++){
////            arr[i] = sc.nextLine();
////        }
////    Scanner sc = new Scanner(System.in);
////    String message;
////    System.out.println("\n\nPlease input a string(limit "+limit+" characters)");
////    message = sc.nextLine();
////    //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
////    //để chuyển đổi message thành một mảng kiểu char
////    char[] charArray = message.toCharArray();
////    //sử dụng vòng lặp for để duyệt các phần tử trong charArray
////    for(int i = 0; i < charArray.length; i++) {
////      if(charArray[i] >= 97 && charArray[i] <= 122){
////        charArray[i] -= 32;
////      }
////    }
////       for(int i=0;i<n;i++){
////            System.out.println(+arr[i]);
////        }
//       
//}
//    public void processData(){
//        makeStatistics();
//
//    }
//
//    private void makeStatistics() {
//        for(int i=0;i<vowel.length;i++){
//            System.out.println("vowel "+ i +" = "+vowel[i]);
//        }
//    }
    public static void main(String[] args){
//      
//        p1.setContent("Bai tap ve nha hom thu 4");
//        p1.processData();
    // sử dụng class Scanner để nhận dữ liệu từ bàn phím
    Scanner sc = new Scanner(System.in);
    String message;
    int limit =100;
     int c1=0, c2=0, c3=0, c4=0, c5=0;
    System.out.println("\n\nPlease input a string (limit "+limit+" character)");
    message = sc.nextLine();
    int n = message.length();
    while(n>limit) {
        System.out.println("Input gain");
          NguyenDacDung p1 = new NguyenDacDung();
          message = sc.nextLine();
    }
    //khai báo một mảng, sau đó sử dụng phương thức toCharArray() 
    //để chuyển đổi message thành một mảng kiểu char
    char[] charArray = message.toCharArray();
    //sử dụng vòng lặp for để duyệt các phần tử trong charArray
    for(int i = 0; i < charArray.length; i++) {
      if(charArray[i] == 97 ) c1= c1+1;
      if(charArray[i] == 117) c2= c2+1;
      if(charArray[i] == 101) c3= c3+1;
      if(charArray[i] ==105) c4= c4+1;
      if(charArray[i] == 111) c5= c5+1;
    }
    // chuyển đổi mảng char thành string
 //   message = String.valueOf(charArray);
    System.out.print("thong ke cua so ki tu vowel \n");
    System.out.print("a");  System.out.print("("); System.out.print(+c1); System.out.print(")");
             System.out.print("\n");
    System.out.print("u");  System.out.print("("); System.out.print(+c2); System.out.print(")");
             System.out.print("\n");
    System.out.print("e");  System.out.print("("); System.out.print(+c3); System.out.print(")");
             System.out.print("\n");
    System.out.print("i");  System.out.print("("); System.out.print(+c4); System.out.print(")");
             System.out.print("\n");
    System.out.print("o");  System.out.print("("); System.out.print(+c5); System.out.print(")");
//             System.out.print("\n");
//    System.out.println("u:"+c2);
//    System.out.println("e:"+c3);
//    System.out.println("i:"+c4);
//    System.out.println("o:"+c5 );
    System.out.println("\n---------------------------------");
    }
    
}
