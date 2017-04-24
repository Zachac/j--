package jminusminus;

public class JLiteralFloat extends JExpression {

	private String text;

	public JLiteralFloat(int line, String image) {
		super(line);
		this.text = image;
	}

	@Override
	public JExpression analyze(Context context) {
        type = Type.FLOAT;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void codegen(CLEmitter output) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeToStdOut(PrettyPrinter p) {
		p.printf("<JLiteralFloat line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
	}

}
