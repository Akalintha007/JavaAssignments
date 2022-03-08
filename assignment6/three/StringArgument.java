package assignment6.three;

/*3. Create a class with a constructor that takes a String argument. During construction, print the argument. 
Create an array of object references to this class, but don’t actually create objects to assign into the array. 
When you run the program, notice whether the initialization messages from the constructor calls are printed.
.*/
public class StringArgument {
    StringArgument(String arg){
        System.out.println(arg);
    }
    public static void main(String[] args) {
        StringArgument arr[] = new StringArgument[3];
        
    }
    
}
