
package j1.s.p0104;
import java.lang.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author Legon
 */
class LoadandFind {    
        Scanner sc= new Scanner(System.in);
        List<String> names = new ArrayList<>();
    public LoadandFind(String link2) {
        try {
      File myObj = new File(link2);
      //dk nhan file neu sai nhap lai
     while(!myObj.exists()) {
         System.out.println("Wrong directory please enter again.");
         link2=sc.nextLine();
          myObj = new File(link2);
     }
     //sau dk tren thi myobj moi dc su dung
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        StringTokenizer stk = new StringTokenizer(data," ");
        //add vo list
            while(stk.hasMoreTokens()){
                names.add(stk.nextToken());               
            }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
    System.out.println("Please enter string to search:");
    String word= sc.nextLine();
        System.out.println("Search results:");
    for(int j=0; j<names.size();j++){
               if(names.get(j).toUpperCase().contains(word.toUpperCase()))
                  System.out.println(names.get(j));  
            }
    }
           }
//15
//        ArrayList<String> list= new ArrayList();
//        ArrayList<String> list2= new ArrayList();
    //    String[] aray = new String[51];    
//17
//39
//    for(int i=0;i< list.size();i++){
//        //if(list.get(i).toUpperCase().contains(word.toUpperCase())){
//            StringTokenizer stk = new StringTokenizer(list.get(i)," ");
//            
//            while(stk.hasMoreTokens()){
//                names.add(stk.nextToken());               
//            }
//        }
//47
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//   File f = new File(link2); 
//        int i=0;
//        if (f.exists()==false) System.out.println("Wrong direction");
//        try {
//            FileReader fr = new FileReader(f); // open file for reading 
//            BufferedReader br = new BufferedReader(fr); // for reading lines
//            String line; // Line read from file
//           while((line = br.readLine()) != null) {
//       //  while(i<50){
//           //for( i=0;i<5000;i++){
//                line = br.readLine().trim();
//                StringTokenizer stk = new StringTokenizer(line," ");
//                String aa = stk.nextToken();
//                list.add(aa);
//            //       i++;
//            }  
//        } catch (Exception e) {
//            System.err.println(e);
//        }
//  //      String link2= "C:\\Users\\Legon\\Videos\\100tr.txt";
////        System.out.println("Ener word to find");
////        String word= sc.nextLine();
//           for(int j=0;j<list.size();j++){
//       //        if(list.get(j).toUpperCase().contains(word.toUpperCase()))
//                   //System.out.println(aray[j]);
//                   System.out.println(list.get(j));

//    public void whenReadWithBufferedReader_thenCorrect()
//  throws IOException {
//     String expected_value = "Hello, world!";
//     String file ="src/test/resources/fileTest.txt";
//     
//     BufferedReader reader = new BufferedReader(new FileReader(file));
//     String currentLine = reader.readLine();
//     reader.close();
//
////    assertEquals(expected_value, currentLine);
//}
//    public String readFile(String filename) throws IOException
//{
//    String content = null;
//    File file = new File(filename); // For example, foo.txt
//    FileReader reader = null;
//    try {
//        reader = new FileReader(file);
//        char[] chars = new char[(int) file.length()];
//        reader.read(chars);
//        content = new String(chars);
//        reader.close();
//    } catch (IOException e) {
//        e.printStackTrace();
//    } finally {
//        if(reader != null){
//            reader.close();
//        }
//    }
//    System.out.println(content);
//    return content;
//}
    
    

