package grammar.parsetree.node;


public interface IrNode
{
	String getName();
	NodeType getNodeType();
	Offset getOffset();
}
