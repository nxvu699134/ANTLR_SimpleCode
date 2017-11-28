package grammar.parsetree.node.expression.literal;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

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

	private String __value;
}
