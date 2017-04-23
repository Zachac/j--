package jminusminus;

public class JForStatement extends JStatement {

    
    JExpression conditions;
    
    JStatement body;
    
    public JForStatement(int line, JExpression forExpression, JStatement body) {
        super(line);
        this.conditions = forExpression;
        this.body = body;
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
        p.printf("<JForStatement line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<ForExpression>\n");
        p.indentRight();
        conditions.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<Body>\n");
        p.indentRight();
        body.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Body>\n");
        p.indentLeft();
        p.printf("</JForStatement>\n");
    }

}
