
import java.lang.IllegalArgumentException;
import java.lang.System;

public class ThrowTest {
	
	public static void main(String[] args) {
        
        System.out.println(false ? false : true);
        System.out.println(true ? false : true);
        
        int i = 0;
        
        do {
            i = i + 1;
            System.out.println(i);
        } while (i <= 9);
        
        for (i = 10; i > 0; i = i - 1) {
            System.out.println(i);
        }
        
        if (falseMethod || trueMethod()) {
            
        }
        
		throw new IllegalArgumentException("exception message");
	}
    
    public static boolean falseMethod() {
        System.out.println(false);
        return false;
    }
    
    public static boolean trueMethod() {
        System.out.println(true);
        return true;
    }
}
