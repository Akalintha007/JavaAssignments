package assignment7.five;

public class Outer1 {
    
    public class Inner1{

        private Integer sampleint;
        private String samplestring;

        Inner1(Integer int1, String str1){

            sampleint=int1;
            samplestring=str1;
        }
        public void printAttributes(){
            System.out.println(sampleint);
            System.out.println(samplestring);
        }
    }
}
