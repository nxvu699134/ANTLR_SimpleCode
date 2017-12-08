package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

public class IrContinueStatement extends IrBaseStatement
{
	public IrContinueStatement(Offset offset)
	{
		super("continue", offset);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.CONTINUE;
	}
}
