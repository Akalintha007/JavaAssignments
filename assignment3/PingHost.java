package assignment3;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class PingHost {
   
    public static void runSystemCommand(String command) {

		try {
			Process process = Runtime.getRuntime().exec(command);
			BufferedReader read = new BufferedReader(
					new InputStreamReader(process.getInputStream()));

			String str = "";
			while ((str = read.readLine()) != null) {
				System.out.println(str);
			}
		} 
		catch (Exception exception) {
			exception.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		String ipAddress;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter IP Address : ");
		ipAddress =scan.nextLine();
		runSystemCommand("ping " + ipAddress);
		scan.close();

	
	}
}
