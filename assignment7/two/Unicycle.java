package assignment7.two;

public class Unicycle extends Cycle{
    
    @Override
    void ride(){
        System.out.println("Riding Unicycle");
    }

    @Override
    void wheels(){
        System.out.println("Unicycle ha 1 wheel.");
    }

    void balance(){
        System.out.println("Unicycle needs balance");
    }
}
