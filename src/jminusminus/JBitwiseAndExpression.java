package jminusminus;

public class JBitwiseAndExpression extends JBinaryExpression {

    public JBitwiseAndExpression(int line, JExpression lhs, JExpression rhs) {
        super(line, "&", lhs, rhs);
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
