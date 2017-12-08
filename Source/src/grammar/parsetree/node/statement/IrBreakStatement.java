package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

public class IrBreakStatement extends IrBaseStatement
{
	public IrBreakStatement(Offset offset)
	{
		super("break", offset);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.BREAK;
	}
}
