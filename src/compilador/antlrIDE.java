package compilador;

import compilador.CalcParser;
import java.io.IOException;
import compilador.MyVisitor;
import java.awt.HeadlessException;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class antlrIDE {

    public static void main(String[] args) throws IOException {
        //  showParseTreeFrame(prog, parser);
        
        String filename = "teste.c";

        
                    
        ANTLRFileStream charInput = new ANTLRFileStream(filename);
        CalcLexer lexer = new CalcLexer(charInput);
        
        
        if (args.length >= 1) {
            filename = args[0];
        }
        CharStream stream = null;
        if (filename != null) {
            stream = new ANTLRFileStream(filename);
        } else {
            stream = new ANTLRInputStream(System.in);
        }
        //grammarCLexer lexer = new grammarCLexer(stream);            //Lexer
        TokenStream tokens = new CommonTokenStream(lexer);  //nextToken 
        CalcParser parser = new CalcParser(tokens);         //Parser
        CalcParser.ProgramContext program = parser.program();        //Exec Parser prog
        showParseTreeFrame(program, parser);
        MyVisitor pv = new MyVisitor();
        pv.visit(program);

    }

    private static void showParseTreeFrame(ParseTree tree, CalcParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()), tree);
        viewr.setScale(1);
        panel.add(viewr);
        frame.add(panel);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_HORIZ);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}