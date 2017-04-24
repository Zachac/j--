package jminusminus;

public class JConditionalExpression extends JExpression {

    private JExpression condition;
    private JExpression output1;
    private JExpression output2;

    public JConditionalExpression(int line, JExpression lhs, JExpression output1, JExpression output2) {
        super(line);
        
        this.condition = lhs;
        this.output1 = output1;
        this.output2 = output2;
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
        p.printf("<JConditionalExpression line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<TestExpression>\n");
        p.indentRight();
        condition.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<ThenExpression>\n");
        p.indentRight();
        output1.writeToStdOut(p);
        p.indentLeft();
        p.printf("</ThenExpression>\n");
        
        p.printf("<ElseExpression>\n");
        p.indentRight();
        output2.writeToStdOut(p);
        p.indentLeft();
        p.printf("</ElseExpression>\n");
        
        p.indentLeft();
        p.printf("</JConditionalExpression>\n");
    }

}
