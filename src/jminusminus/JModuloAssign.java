package jminusminus;

public class JModuloAssign extends JAssignment {

	public JModuloAssign(int line, JExpression lhs,
			JExpression rhs) {
		super(line, "%=", lhs, rhs);
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
