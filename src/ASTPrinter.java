public class ASTPrinter {
	private int indent = 1;

	private String indentString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < indent; ++i) {
			sb.append("    ");
		}
		return sb.toString();
	}

	public void print(Node node) {
		System.out.println("\nPrinting the tree ...");
		ast_visit(node);
	}

	private void ast_visit(Node node) {
		System.out.println(indentString() + node.toString());
		indent += 1;
		int count = node.jjtGetNumChildren();
		for (int i=0;i<count;i++) {
			Node child = node.jjtGetChild(i);
			ast_visit(child);
		}
		indent -= 1;	  
	}

}