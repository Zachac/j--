package pass;

import java.lang.System;

public class ConditionalOrTest {
    
    public static void main(String[] args) {
        
	      boolean a = true;
	      boolean c = true;
	      boolean b = false;
	      boolean d = false;

	      System.out.println("a || b = " + (a||b) );
	      System.out.println("a || c = " + (a||c) );
	      System.out.println("b || c = " + (b||c) );
	      System.out.println("b || d = " + (b||d) );
	   }
}