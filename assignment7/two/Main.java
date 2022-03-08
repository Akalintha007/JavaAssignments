package assignment7.two;

public class Main {
    
    public static void main(String args[]) {
        
        /* Unicycle unicycle= new Unicycle();
        Bicycle bicycle=  new Bicycle();
        Tricycle tricycle= new Tricycle();

        unicycle.ride();
        bicycle.ride();
        tricycle.ride(); */

        Cycle cycle[] = new Cycle[3];
        //Upcasting    
        cycle[0] = new Unicycle();
        cycle[1] = new Bicycle();
        cycle[2] = new Tricycle();

        

        /* cycle[0].balance();
           cycle[1].balance();
           Throws error if we upcast Unicycle and Bicycle into Cycle 
           cause the parent class has no idea about the balance methods defined in child classes.
           The created instances can only access what is available in reference type of object and not type of obj.*/
        
        //Downcasting
        Unicycle obj = new Unicycle();
        obj.balance();
        Bicycle obj2 = new Bicycle();
        obj2.balance();

        
        

    } 
}
