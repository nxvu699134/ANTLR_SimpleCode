package grammar.parsetree.node.expression;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

public class IrLocation extends IrBaseExpression
{
	public IrLocation(String name, IrExpression expr, Offset offset)
	{
		super(name, offset);
		this.__expr = expr;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.LOCATION;
	}

	IrExpression __expr;
}