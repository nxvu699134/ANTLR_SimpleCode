package grammar.parsetree.node.statement;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrExpression;
import grammar.parsetree.node.id.IrId;

public class IrForStatement extends IrBaseStatement
{

	public IrForStatement(IrId count, IrExpression startExpr, IrExpression endExpr, IrBlock block, Offset offset)
	{
		super("for", offset);
		this.__count = count;
		this.__startExpr = startExpr;
		this.__endExpr = endExpr;
		this.__block = block;
	}

	@Override
	public StatementType getStatementType()
	{
		return StatementType.FOR;
	}

	private IrId __count;
	private IrExpression __startExpr;
	private IrExpression __endExpr;
	private IrBlock __block;
}
