package grammar.parsetree.node.expression.literal;


import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

public class IrIntLiteral extends IrBaseExpression
{
	public IrIntLiteral(String value, Offset offset)
	{
		super("int_lit", offset);
		this.__value = value;
	}

	public int getValue()
	{
		return Integer.decode(this.__value);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.INT_LIT;
	}
	private String __value;
}
