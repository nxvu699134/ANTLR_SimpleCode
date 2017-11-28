package grammar.parsetree.node.statement;

import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrExpression;
import grammar.parsetree.node.expression.IrLocation;
import grammar.parsetree.node.op.IrAssignOp;

public class IrAssignStatement extends IrBaseStatement
{
	public IrAssignStatement(IrLocation location, IrAssignOp op, IrExpression expr, Offset offset)
	{
		super(location.getName(), offset);
		this.__location = location;
		this.__op = op;
		this.__expr = expr;
	}

	@Override
	public StatementType getStatementType()
	{
		return StatementType.ASSIGN;
	}

	private IrLocation __location;
	private IrAssignOp __op;
	private IrExpression __expr;
}