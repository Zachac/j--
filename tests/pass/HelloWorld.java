// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package pass;

import java.lang.System;

public class HelloWorld {
	
	/* This shouls also be fine. */
	
    public static String message() {
    	int apple = 2 + 2;
    	
        return "Hello, World!";
    }

    public static void main(String[] args) {
        System.out.println(HelloWorld.message());
    }

}



/* This Should not Appear 
 * 
 * alright?  */

/*/

