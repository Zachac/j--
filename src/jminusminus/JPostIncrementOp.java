package jminusminus;

public class JPostIncrementOp extends JUnaryExpression {


    public JPostIncrementOp(int line, JExpression arg) {
        super(line, "post--", arg);
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
