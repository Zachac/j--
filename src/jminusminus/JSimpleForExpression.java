package jminusminus;

public class JSimpleForExpression extends JExpression {

    JStatement initializer;
    
    JExpression test;
    
    JStatement update;
    
    public JSimpleForExpression(int line, JStatement initializer, JExpression test, JStatement update) {
        super(line);
        this.initializer = initializer;
        this.test = test;
        this.update = update;
    }
    
    @Override
    public JExpression analyze(Context context) {
        initializer = (JStatement) initializer.analyze(context);
        test = (JExpression) test.analyze(context);
        test.type().mustMatchExpected(line(), Type.BOOLEAN);
        update = (JStatement) update.analyze(context);
        return this;
    }

    @Override
    public void codegen(CLEmitter output) {
        
    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JSimpleForExpression line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<Initializer>\n");
        p.indentRight();
        initializer.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Initializer>\n");
        p.printf("<TestExpression>\n");
        p.indentRight();
        test.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<Update>\n");
        p.indentRight();
        update.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Update>\n");
        p.indentLeft();
        p.printf("</JForStatement>\n");
    }

}
