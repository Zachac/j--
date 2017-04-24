package jminusminus;

public class JBitwiseXOrExpression extends JBinaryExpression {

    public JBitwiseXOrExpression(int line, JExpression lhs, JExpression rhs) {
        super(line, "^", lhs, rhs);
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

