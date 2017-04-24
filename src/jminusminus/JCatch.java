package jminusminus;

public class JCatch extends JAST {

    private JFormalParameter excpetion;
    private JBlock caught;

    public JCatch(int catchLine, JFormalParameter exception, JBlock caught) {
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
        
        p.println("<Exception>");
        p.indentRight();
        excpetion.writeToStdOut(p);
        p.indentLeft();
        p.println("</Exception>");
        
        p.println("<Catch>");
        p.indentRight();
        caught.writeToStdOut(p);
        p.indentLeft();
        p.println("</Catch>");
        
        p.indentLeft();
        p.println("</JTryStatement>");
    }

}
