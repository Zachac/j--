package jminusminus;

import static jminusminus.CLConstants.ATHROW;

public class JThrowStatement extends JStatement {

    private JExpression exception;

    public JThrowStatement(int line, JExpression exception) {
        super(line);
        
        this.exception = exception;
    }

    @Override
    public JAST analyze(Context context) {
    	
    	exception = (JExpression) exception.analyze(context);
    	
    	if (!exception.type.isJavaAssignableFrom(Type.typeFor(Throwable.class))) {
    		JAST.compilationUnit.reportSemanticError(line(),
                    "Can only throw exceptions, got:" + exception.type);
    	}
    	
    	
        return this;
    }

    @Override
    public void codegen(CLEmitter output) {
    	exception.codegen(output);
    	output.addNoArgInstruction(ATHROW);
    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JCatch line=\"%d\">\n", line());
        p.indentRight();
        
        p.println("<Exception>");
        p.indentRight();
        exception.writeToStdOut(p);
        p.indentLeft();
        p.println("</Exception>");
        
        p.indentLeft();
        p.println("</JTryStatement>");
    }

}
