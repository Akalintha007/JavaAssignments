package assignment1;

import java.io.File;
import java.util.Scanner;

public class AbsolutePath {

    private void findFile()
	{
		File file = new File("c:/Users/Admin");
		String str ;
		Scanner scan = new Scanner(System.in);
		do{
			int x =0;
			System.out.print("Enter file/folder name: ");
			str =scan.nextLine();
			//scan.close();

			 String[] files = file.list();
			for (String string : files){
				 Boolean str1 = str.equals(string);
				if (str1){
				x = 1;
				System.out.print("File Found : ");
				System.out.println(string);
				System.out.println("Path : "+ file.getAbsolutePath());
				
				}			
			}
				if(x == 0)
				{
					System.out.println("File not find");
				}
			} while(str != "exit");
	}
		public static void main(String[] args){
			AbsolutePath obj =new AbsolutePath();
			obj.findFile();
		}	
}