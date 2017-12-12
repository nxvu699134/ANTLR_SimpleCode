package grammar.parsetree.node.expression;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.type.IrType;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class IrBaseExpression extends IrBaseNode implements IrExpression
{
	public IrBaseExpression(String name, Offset offset)
	{
		super(name, offset);
	}
	public IrBaseExpression(String name, IrExpression expr, Offset offset)
	{
		super(name, offset);
		this.__expr = expr;
	}
	public IrBaseExpression(int sign, IrExpression expr, IrType type, Offset offset)
	{
		this._sign = sign;
		this.__expr = expr;
		this._offset = offset;
		this.__type = type;
	}
	public IrBaseExpression(IrExpression expr, IrType type, Offset offset)
	{
		this.__expr = expr;
		this._offset = offset;
		this.__type = type;
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

	@Override
	public IrExpression getExpression()
	{
		return this.__expr;
	}

	@Override
	public IrType getType()
	{
		return this.__type;
	}

	@Override
	public void setType(IrType type)
	{
		this.__type = type;
	}

	protected int _sign = 1;
	private IrExpression __expr = null;
	private IrType __type;

}
