package assignment2;
import java.util.Scanner;

public class FindAlphabet {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        
        System.out.print("Enter your String ");
        str =scan.nextLine();
        scan.close();
  
        str = str.toLowerCase();
        boolean[] aList = new boolean[26]; 
        int index = 0;
        int flag = 1;
        for (int i = 0; i < str.length(); i++) {
          if( str.charAt(i) >= 'a' &&  str.charAt(i) <= 'z') 
          {
              index = str.charAt(i) - 'a'; 
           }
           aList[index] = true; 
        }
        for (int i = 0; i <= 25; i++)
         {
           if (aList[i] == false)
              flag = 0;
        }
        if (flag == 1)
  
           System.out.println("all alphabets found in the string");
        else
           System.out.println("some alphabets are missing in the given string");
     }
    
}
