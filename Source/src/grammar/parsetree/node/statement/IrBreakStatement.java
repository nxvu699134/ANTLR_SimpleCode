package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

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
