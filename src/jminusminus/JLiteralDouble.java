package jminusminus;

public class JLiteralDouble extends JExpression {

	private String text;

	public JLiteralDouble(int line, String image) {
		super(line);
		this.text = image;
	}

	@Override
	public JExpression analyze(Context context) {
        type = Type.DOUBLE;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void codegen(CLEmitter output) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeToStdOut(PrettyPrinter p) {
		p.printf("<JLiteralDouble line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);

	}

}
