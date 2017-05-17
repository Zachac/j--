package jminusminus;

public class JConditionalOrExpression extends JBooleanBinaryExpression {
	
	public JConditionalOrExpression(int line, JExpression lhs, JExpression rhs) {
		super(line, "||", lhs, rhs);
	}

	public JExpression analyze(Context context) {
		lhs = (JExpression) lhs.analyze(context);
        rhs = (JExpression) rhs.analyze(context);
        lhs.type().mustMatchExpected(line(), Type.BOOLEAN);
        rhs.type().mustMatchExpected(line(), Type.BOOLEAN);
        type = Type.BOOLEAN;
        return this;
	}

	public void codegen(CLEmitter output, String targetLabel, boolean onTrue) {
		if (onTrue) { 
            lhs.codegen(output, targetLabel, true); 
            rhs.codegen(output, targetLabel, true); 
            
        } else { 
        	String fallThroughLabel = output.createLabel();
            lhs.codegen(output, fallThroughLabel, true); 
            rhs.codegen(output, targetLabel, false); 
            output.addLabel(fallThroughLabel);
        }
	}
}