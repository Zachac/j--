package jminusminus;

public class JSwitchCase extends JAST {
    
    TokenInfo type;
    JStatement statement;
    
    public JSwitchCase(int line, TokenInfo type, JStatement statement) {
        super(line);
        this.type = type;
        this.statement = statement;
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
        p.printf("<JSwitchCase line=\"%d\" type=\"%s\">\n", line(), type.image());
        p.indentRight();

        p.printf("<Statement>\n");
        p.indentRight();
        statement.writeToStdOut(p);
        p.indentLeft();
        p.printf("</Statement>\n");
        
        p.indentLeft();
        p.printf("</JSwitchCase>\n");

    }

}
