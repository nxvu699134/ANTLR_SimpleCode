package grammar.parsetree.node.expression;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

public class IrBaseExpression extends IrBaseNode implements IrExpression
{
	public IrBaseExpression(String name, Offset offset)
	{
		super(name, offset);
	}
	public IrBaseExpression(int sign, IrExpression expr, Offset offset)
	{
		this._sign = sign;
		this.__expr = expr;
		this._offset = offset;
	}
	public IrBaseExpression(IrExpression expr, Offset offset)
	{
		this.__expr = expr;
		this._offset = offset;
	}
	public IrBaseExpression(String name)
	{
		super(name);
	}
	public IrBaseExpression(){}

	protected int _sign = 1;
	IrExpression __expr = null;
}
