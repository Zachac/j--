package jminusminus;

public class JCatch extends JAST {

    private JExpression excpetion;
    private JBlock caught;

    public JCatch(int catchLine, JExpression exception, JBlock caught) {
        super(catchLine);
        
        this.excpetion = exception;
        this.caught = caught;
        
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
        excpetion.writeToStdOut(p);
        p.indentLeft();
        p.print("</Exception>");
        
        p.print("<Catch>");
        p.indentRight();
        caught.writeToStdOut(p);
        p.indentLeft();
        p.print("</Catch>");
        
        p.indentLeft();
        p.printf("</JTryStatement>\n");
    }

}
