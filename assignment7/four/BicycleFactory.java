package assignment7.four;

public class BicycleFactory  implements CycleFactory {

    @Override
    public Cycle getCycle() {
        
        return new Bicycle();
    }
    
}
