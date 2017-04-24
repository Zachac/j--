

public class SimpleTests {
    public void literaltest() {
        int i;
        double d;
        float f;
        long g;
        
        i = 3;
        d = 0.0;
        f = 0.0f;
        g = 2333L;
    }
    
    
    public String operatorTests () throws Exception, IOException, FileNotFoundException {
        int j = 3 + 3 - 2 * 5 / 1 % 2;
        j++;
        j--;
        
        boolean f = !true;
        
        if ( j == 3 );
        if ( j != 3 );
        if ( j > 3 );
        if ( j < 3 );
        if ( j >= 3 );
        if ( j <= 3 );
        
        j = ~j;
        j = 3 << 1;
        j = 256 >> 2;
        j = 256 >>> 2;
        j = j & j;
        j = j ^ j;
        j = j | 1;
        

        j += 2;
        j -= 5;
        j *= 3;
        j /= 6;
        j %= 2;
        j &= 1;
        j ^= 2;
        j |= 3;
        j <<= 2;
        j >>= 1;
        j >>>= 5;
    }
    
    
    public String logicalExpressionTests () throws Exception, IOException, FileNotFoundException {
        if (true && false) ;
        if (true || false) ;
        if (true && true && true) ;
        if (true && false && true) ;
        if (true && false || true) ;
        if (true && false) ;
    }
    
    public void conditionalExpressionTests () throws Exception, IOException, FileNotFoundException {
        if (true ? false : true) ;
    }
    
    public void tryCatchFinallyStatementTests() {
        try {
            throw new Exception();
        } catch (IOException e) {
            
        } finally {
            
        }
        
        try {
            
        } finally {
            
        }
        
        try {
            
        } catch (Exception e) {
            
        }
        
        
        throw new Exception();
    }
}


