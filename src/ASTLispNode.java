/* Generated By:JJTree: Do not edit this line. ASTLispNode.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTLispNode extends SimpleNode {
  public ASTLispNode(int id) {
    super(id);
  }

  public ASTLispNode(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
  
  public SimpleNode interpret(Environment env) {
env.print();
		int children = jjtGetNumChildren();
		for(int i = 0; i < children; i++) {
			System.out.println("Result: " + ((SimpleNode)jjtGetChild(i)).interpret(env).name);
		}
		//System.out.println("RootNode");
		return null;
  }
}
/* JavaCC - OriginalChecksum=eecb4e1c9dbcab594695737f0dda95fc (do not edit this line) */
