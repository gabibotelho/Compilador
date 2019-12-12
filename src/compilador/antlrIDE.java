package compilador;

import java.awt.Graphics;
import java.io.IOException;

import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class antlrIDE {
    
    public static void main(String[] args) throws IOException {
        new TabbedPanel();
    }
    
    /*
    public static void main(String[] args) throws IOException{
        
        System.out.println("Going to exec: input.minic" );
        File file = new File("input.minic");
        Scanner s = new Scanner(file);
        String input = "";
        while (s.hasNextLine()) {
            input = input + s.nextLine();
        }
        System.out.println(input);
        Integer r = parse(input);
    }
    */
    
    private static Integer parse(String text) throws RecognitionException {
        ANTLRInputStream input = new ANTLRInputStream(text);
        CalcLexer lexer = new CalcLexer(input);
        
        lexer.removeErrorListeners();
        lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        TokenStream tokenStream = new CommonTokenStream(lexer);
        CalcParser parser = new CalcParser(tokenStream);
        
        parser.removeErrorListeners();
	parser.addErrorListener(ThrowingErrorListener.INSTANCE);
        
        ParseTree tree = parser.program();
        MyVisitor visitor = new MyVisitor();
        String result = visitor.visit(tree);
        System.out.println("result = " + result);
        // Exibir a arvore
        showParseTreeFrame(tree, parser);

        return 1;// prog.value;
    }

    /*
     * private static void showParseTreeFrame(ParseTree tree, GrammarParser parser)
     * throws HeadlessException { JFrame frame = new JFrame("SRC: " +
     * tree.getText()); JPanel panel = new JPanel(); TreeViewer viewr = new
     * TreeViewer(Arrays.asList(parser.getRuleNames()), tree); viewr.setScale(3);
     * panel.add(viewr); frame.add(panel); frame.setSize(1000, 600);
     * frame.setState(JFrame.MAXIMIZED_HORIZ);
     * frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); frame.setVisible(true);
     * }
     */
    private static void showParseTreeFrame(ParseTree tree, CalcParser parser) throws HeadlessException {
        JFrame frame = new JFrame("SRC: " + tree.getText());
        TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        viewr.setScale(1);
        JPanel panel = new JPanel();
        panel.add(viewr);
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setAutoscrolls(true);
        frame.add(scroll);
        frame.setSize(1000, 600);
        frame.setState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        panelToImagem(panel);
    }

    private static void panelToImagem(JPanel panel) {
        BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.createGraphics();
        panel.paint(g);
        g.dispose();
        try {
            ImageIO.write(image, "png", new File("CST.png"));
        } catch (Exception e) {
        }
    }
    
}

        

