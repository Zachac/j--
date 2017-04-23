package jminusminus;

public class JEnhancedForExpression extends JExpression {

    JFormalParameter param;
    JExpression iterable;
    
    public JEnhancedForExpression(int line, JFormalParameter param, JExpression iterable) {
        super(line);
        this.param = param;
        this.iterable = iterable;
    }
    
    @Override
    public JExpression analyze(Context context) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void codegen(CLEmitter output) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JEnhancedForExpression line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<Parameter>\n");
        p.indentRight();
        param.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Parameter>\n");
        p.printf("<IterableExpression>\n");
        p.indentRight();
        iterable.writeToStdOut(p);
        p.indentLeft();
        p.printf("</IterableExpression>\n");
        p.indentLeft();
        p.printf("</JForStatement>\n");
    }

}
