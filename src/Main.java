import java.io.*;

public class Main {
	public static void main(String args[]) throws ParseException, FileNotFoundException, IOException {
		InputStream in = System.in;
		if (args.length > 0 ) {
			in = new FileInputStream(args[0]);
		}
		Parser parser = new Parser(in);
		while(true) {
			
			ASTLispNode root = parser.prog();
			System.out.println("\nProgram parsed successfully.\n");
		
			VisitorPrinter printer = new VisitorPrinter();
			System.out.println("\nPrinting the tree ...");
		    printer.visit(root);
		    
		    Environment env = new Environment();
		    System.out.println("\n\nInterpreting...");
	        root.interpret(env);
		}
	}
}