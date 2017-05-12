package jminusminus;

import static jminusminus.CLConstants.GOTO;

public class JForStatement extends JStatement {

    
    JExpression expression;
    JStatement body;
    
    JSimpleForExpression simpleExpression;
    
    public JForStatement(int line, JExpression forExpression, JStatement body) {
        super(line);
        this.expression = forExpression;
        this.body = body;
    }
    
    @Override
    public JAST analyze(Context context) {
        if (expression instanceof JSimpleForExpression) {
            simpleExpression = (JSimpleForExpression) expression.analyze(context);
            body = (JStatement) body.analyze(context);
        } else {
            JAST.compilationUnit.reportSemanticError(
                    expression.line(), 
                    "Enhanced for expression not supported!");
        }
        
        return this;
    }

    @Override
    public void codegen(CLEmitter output) {
        simpleExpression.initializer.codegen(output);
        
        String test = output.createLabel();
        String out = output.createLabel();
        
        output.addLabel(test);
        simpleExpression.test.codegen(output, out, false);
        body.codegen(output);
        simpleExpression.update.codegen(output);
        output.addBranchInstruction(GOTO, test);
        output.addLabel(out);
    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JForStatement line=\"%d\">\n", line());
        p.indentRight();
        p.printf("<ForExpression>\n");
        p.indentRight();
        expression.writeToStdOut(p);
        p.indentLeft();
        p.printf("</TestExpression>\n");
        p.printf("<Body>\n");
        p.indentRight();
        body.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Body>\n");
        p.indentLeft();
        p.printf("</JForStatement>\n");
    }

}
