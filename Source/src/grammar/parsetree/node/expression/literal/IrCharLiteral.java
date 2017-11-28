package grammar.parsetree.node.expression.literal;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

public class IrCharLiteral extends IrBaseExpression
{
	public IrCharLiteral(String value, Offset offset)
	{
		super("char_lit", offset);
		this.__value = value;
	}

	public String getValue()
	{
		return this.__value;
	}

	private String __value;
}
