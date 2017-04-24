package jminusminus;

import java.util.ArrayList;

public class JTryStatement extends JStatement {

    private ArrayList<JCatch> catches;
    private JBlock finish;
    private JBlock attempt;

    public JTryStatement(int line, JBlock attempt, ArrayList<JCatch> catches, JBlock finish) {
        super(line);
        
        this.attempt = attempt;
        this.catches = catches;
        this.finish = finish;
    }

    @Override
    public JAST analyze(Context context) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void codegen(CLEmitter output) {
        // TODO Auto-generated method stub

    }

    @Override
    public void writeToStdOut(PrettyPrinter p) {
        p.printf("<JTryStatement line=\"%d\">\n", line());
        
        p.indentRight();
        
        p.println("<Try>");
        p.indentRight();
        attempt.writeToStdOut(p);
        p.indentLeft();
        p.println("</Try>");

        
        for (JCatch c : catches) {
            c.writeToStdOut(p);
        }

        if (finish != null) {
        	p.println("<Finally>");
        	p.indentRight();
        	finish.writeToStdOut(p);
        	p.indentLeft();
        	p.println("</Finally>");        	
        }
        p.indentLeft();
        p.println("</JTryStatement>");
    }

}
