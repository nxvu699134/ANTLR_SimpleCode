package grammar.parsetree.node.statement;

import grammar.parsetree.node.Offset;

public class IrBreakStatement extends IrBaseStatement
{
	public IrBreakStatement(Offset offset)
	{
		super("break", offset);
	}

	@Override
	public StatementType getStatementType()
	{
		return StatementType.BREAK;
	}
}
