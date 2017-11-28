package grammar.parsetree.node.expression;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.op.IrOp;

public class IrBinOpExpression extends IrBaseExpression
{
	public IrBinOpExpression(IrExpression leftExpr, IrExpression rightExpr, IrOp op, Offset offset)
	{
		super(leftExpr, offset);
		this.__op = op;
		this.__extendExpr = rightExpr;
	}

	IrExpression __extendExpr;
	IrOp __op;
}
