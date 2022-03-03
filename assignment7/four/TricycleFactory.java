package assignment7.four;

public class TricycleFactory implements CycleFactory{

    @Override
    public Cycle getCycle() {
        
        return new Tricycle();
    }
    

}
