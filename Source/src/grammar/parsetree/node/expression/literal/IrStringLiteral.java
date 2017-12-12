package grammar.parsetree.node.expression.literal;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class IrStringLiteral extends IrBaseExpression
{
	public IrStringLiteral(String value, Offset offset)
	{
		super("string_lit", offset);
		this.__value = value;
	}

	public String getValue()
	{
		return this.__value;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.STRING_LIT;
	}

	private String __value;
}
