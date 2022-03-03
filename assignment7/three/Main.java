package assignment7.three;

public class Main {
    
    public static void m1(History history) { history.previousPapers(); }
	public static void m2(Exam exam) { exam.descreptive(); }
	public static void m3(Labs labs) { labs.equipment(); } 
	public static void m4(Workup workup) { workup.work(); }
	public static void main(String[] args) {
		Anesthesiologost anes = new Anesthesiologost();
		m1(anes);
		m2(anes);
		m3(anes);
		m4(anes);
	}
}
