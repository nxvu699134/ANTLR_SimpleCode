package grammar.parsetree.node.statement;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public abstract class IrBaseStatement extends IrBaseNode implements IrStatement
{
	public IrBaseStatement(){}
	public IrBaseStatement(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.STATEMENT;
	}
}
