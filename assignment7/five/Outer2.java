package assignment7.five;

import assignment7.five.Outer1.Inner1;

public class Outer2 {
    
    public class Inner2 extends Inner1{

        Inner2(Outer1 outer1, Integer int1, String str1) {
            outer1.super(int1, str1);
            
        }


    }
}

