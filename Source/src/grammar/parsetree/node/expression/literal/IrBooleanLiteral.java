package grammar.parsetree.node.expression.literal;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class IrBooleanLiteral extends IrBaseExpression
{
	public IrBooleanLiteral(boolean value, Offset offset)
	{
		super("bool_lit", offset);
		this.__value = value;
	}

	public boolean getValue()
	{
		return this.__value;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.BOOLEAN_LIT;
	}

	private boolean __value;
}
