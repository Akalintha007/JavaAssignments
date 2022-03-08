package assignment7.four;

public class Main {
    
    public static void rideCycle(CycleFactory cyclefactory) {
		Cycle cycle = cyclefactory.getCycle();
		cycle.ride();
	}
	public static void main(String [] args) {
		rideCycle(new UnicycleFactory());
		rideCycle(new BicycleFactory());
		rideCycle(new TricycleFactory());	
	}
}
