package jminusminus;

public class JBitwiseNotOp extends JUnaryExpression {

    public JBitwiseNotOp(int line, JExpression unaryExpression) {
        super(line, "~", unaryExpression);
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

}
