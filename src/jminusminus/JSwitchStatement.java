package jminusminus;

public class JSwitchStatement extends JStatement {

    JSwitchBlock switchBlock;
    JExpression expression;
    
    public JSwitchStatement(int line, JExpression expression, JSwitchBlock switchBlock) {
        super(line);
        this.switchBlock = switchBlock;
        this.expression = expression;
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
        p.printf("<JSwitchStatment line=\"%d\">\n", line());
        p.indentRight();

        p.printf("<ValueExpression>\n");
        p.indentRight();
        expression.writeToStdOut(p);
        p.indentLeft();
        p.printf("</ValueExpression>\n");

        p.printf("<SwitchBlock>\n");
        p.indentRight();
        switchBlock.writeToStdOut(p);
        p.indentLeft();
        p.printf("</SwitchBlock>\n");
        
        p.indentLeft();
        p.printf("</JSwitchStatment>\n");
    }

}
