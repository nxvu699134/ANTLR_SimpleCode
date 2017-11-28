package grammar.parsetree.node.expression.literal;


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
		return Integer.parseInt(this.__value);
	}

	private String __value;
}
