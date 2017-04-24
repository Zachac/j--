package jminusminus;

public class JThrowStatement extends JStatement {

    private JExpression exception;

    public JThrowStatement(int line, JExpression exception) {
        super(line);
        
        this.exception = exception;
    }

    @Override
    public JAST analyze(Context context) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void codegen(CLEmitter output) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JCatch line=\"%d\">\n", line());
        p.indentRight();
        
        p.print("<Exception>");
        p.indentRight();
        exception.writeToStdOut(p);
        p.indentLeft();
        p.print("</Exception>");
        
        p.indentLeft();
        p.printf("</JTryStatement>\n");
    }

}
