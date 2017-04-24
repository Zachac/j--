package jminusminus;

public class JPreDecrementOp extends JUnaryExpression {

	public JPreDecrementOp(int line, JExpression arg) {
		super(line, "--pre", arg);
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
