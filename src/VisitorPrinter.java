public class VisitorPrinter implements ParserVisitor {
	
	private int indent = 1;
	
	private String indentString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < indent; ++i) {
			sb.append("    ");
		}
		return sb.toString();
	}
	
	public void visit(Node node) {
		System.out.println(indentString() + node.toString());
		indent += 1;
		int count = node.jjtGetNumChildren();
		for (int i=0;i<count;i++) {
			Node child = node.jjtGetChild(i);
			visit(child);
		}
		indent -= 1;	  
	}

	@Override
	public Object visit(SimpleNode node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTLispNode node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object visit(ASTList node, Object data) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Object visit(ASTAtom node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTLambdaExpr node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTLetExpr node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTAddExpr node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTSubExpr node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTcar node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTcdr node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object visit(ASTcons node, Object data) {
		// TODO Auto-generated method stub
		return null;
	}
}