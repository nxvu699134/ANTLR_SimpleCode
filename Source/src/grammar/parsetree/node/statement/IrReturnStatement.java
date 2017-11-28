package grammar.parsetree.node.statement;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrExpression;

public class IrReturnStatement extends IrBaseStatement
{
	public IrReturnStatement(IrExpression expr, Offset offset)
	{
		super("return", offset);
		this.__expr = expr;
	}

	@Override
	public StatementType getStatementType()
	{
		return StatementType.RETURN;
	}

	private IrExpression __expr;
}
