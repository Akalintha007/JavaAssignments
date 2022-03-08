package assignment6.two;

// Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one.
public class ConstructorOverload {
    
    ConstructorOverload(){
    //this keyword is used to call some other constructor of same class.
    this("a_kalintha");
    }
    ConstructorOverload(String name){
        System.out.println("Overloaded Constructor. Hello "+name);
    }
    public static void main(String[] args){
        ConstructorOverload constructoroverload = new ConstructorOverload();
        System.out.println(constructoroverload);
    }

}
