package jminusminus;

public class JLiteralLong extends JExpression {

	private String text;

	public JLiteralLong(int line, String image) {
		super(line);
		this.text = image;
	}

	@Override
	public JExpression analyze(Context context) {
        type = Type.LONG;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void codegen(CLEmitter output) {
		// TODO Auto-generated method stub

	}

	@Override
	public void writeToStdOut(PrettyPrinter p) {
		p.printf("<JLiteralLong line=\"%d\" type=\"%s\" " + "value=\"%s\"/>\n",
                line(), ((type == null) ? "" : type.toString()), text);
	}

}
