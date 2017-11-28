package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrBaseExpression;

import java.util.ArrayList;
import java.util.List;

public abstract class IrBaseCallExpression extends IrBaseExpression implements IrCallExpression
{
	public IrBaseCallExpression(String name, Offset offset)
	{
		super(name, offset);
		this._args = new ArrayList<>();
	}

	@Override
	public void pushArg(IrNode arg)
	{
		this._args.add(arg);
	}

	@Override
	public IrNode getArg(int i)
	{
		return this._args.get(i);
	}

	protected List<IrNode> _args;
}
