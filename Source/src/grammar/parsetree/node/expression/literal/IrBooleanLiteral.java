package grammar.parsetree.node.expression.literal;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

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

	private boolean __value;
}
