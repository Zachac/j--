package jminusminus;

import static jminusminus.CLConstants.GOTO;

public class JConditionalExpression extends JExpression {

    private JExpression condition;
    private JExpression output1;
    private JExpression output2;

    public JConditionalExpression(int line, JExpression lhs, JExpression output1, JExpression output2) {
        super(line);
        
        this.condition = lhs;
        this.output1 = output1;
        this.output2 = output2;
    }

    @Override
    public JExpression analyze(Context context) {
    	condition = (JExpression) condition.analyze(context);
        condition.type().mustMatchExpected(line(), Type.BOOLEAN);
        output1 = (JExpression) output1.analyze(context);
        output2 = (JExpression) output2.analyze(context);
        output1.type().mustMatchExpected(line, output2.type);
        this.type = output1.type;

        return this;
    }

    @Override
    public void codegen(CLEmitter output) {
    	String elseLabel = output.createLabel();
        String endLabel = output.createLabel();
        
        condition.codegen(output, elseLabel, false);
        output1.codegen(output);
        output.addBranchInstruction(GOTO, endLabel);
        output.addLabel(elseLabel);        
        output2.codegen(output);
        output.addLabel(endLabel);
    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JConditionalExpression line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<TestExpression>\n");
        p.indentRight();
        condition.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<ThenExpression>\n");
        p.indentRight();
        output1.writeToStdOut(p);
        p.indentLeft();
        p.printf("</ThenExpression>\n");
        
        p.printf("<ElseExpression>\n");
        p.indentRight();
        output2.writeToStdOut(p);
        p.indentLeft();
        p.printf("</ElseExpression>\n");
        
        p.indentLeft();
        p.printf("</JConditionalExpression>\n");
    }

}
