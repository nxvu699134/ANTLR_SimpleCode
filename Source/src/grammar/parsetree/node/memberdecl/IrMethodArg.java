package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.id.IrId;
import grammar.parsetree.node.type.IrType;

public class IrMethodArg extends IrBaseNode
{

	public IrMethodArg(IrType type, IrId id, Offset offset)
	{
		super(id.getName(), offset);
		this.__type = type;
		this.__id = id;
	}

	public IrId getId()
	{
		return this.__id;
	}
	public IrType getType() { return this.__type;}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.METHOD_ARG;
	}

	private IrId __id;
	private IrType __type;
}
