package grammar.parsetree.node.id;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class IrId extends IrBaseNode
{
	public IrId(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.ID;
	}
}
