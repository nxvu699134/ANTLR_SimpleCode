package grammar.parsetree.node.vardecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.id.IrId;
import grammar.parsetree.node.type.IrType;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public class IrVar extends IrBaseNode
{
	public IrVar(IrType type, IrId id, Offset offset)
	{
		super(id.getName(), offset);
		this.__type = type;
		this.__id = id;
	}

	public void setType(IrType type)
	{
		this.__type = type;
	}

	public IrType getType()
	{
		return this.__type;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.VAR;
	}
	private IrId __id;
	private IrType __type;
}
