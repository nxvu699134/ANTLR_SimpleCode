package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

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
