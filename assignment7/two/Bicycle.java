package assignment7.two;

public class Bicycle extends Cycle {
    
    @Override
    void ride(){
        System.out.println("Riding Bicycle");
    }

    @Override
    void wheels(){
        System.out.println("Bicycleycle ha 2 wheels.");
    }

    void balance(){
        System.out.println("Bicycle needs balance");
    }
}
