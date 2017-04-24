package jminusminus;

import java.util.ArrayList;

public class JSwitchBlock extends JAST {

    ArrayList<JSwitchCase> cases;
    
    public JSwitchBlock(int line, ArrayList<JSwitchCase> cases) {
        super(line);
        this.cases = cases;
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
        p.printf("<JSwitchCases line=\"%d\">\n", line());
        p.indentRight();

        
        for (JSwitchCase jcase : cases) {
            jcase.writeToStdOut(p);
        }
        
        
        p.indentLeft();
        p.printf("</JSwitchCases>\n");
    }

}
