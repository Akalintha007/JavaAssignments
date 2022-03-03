package assignment4;

import java.util.*;

public class HealthCare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no of inputs to be passed: ");
        int n = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Signup Date and Current Date in the format given");
        System.out.println("dd-mm-yyyy dd-mm-yyyy");
        ArrayList<String> input = new ArrayList<>();
        scan.close();
        while(n-- >0){
            String temp = scan.nextLine();
            input.add(temp);
        }
        PrintAnswer.printAns(input);
    }
}
