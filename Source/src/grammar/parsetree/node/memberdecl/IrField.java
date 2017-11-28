package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.literal.IrIntLiteral;
import grammar.parsetree.node.id.IrId;
import grammar.parsetree.node.type.IrType;

public class IrField extends IrBaseNode
{
	public IrField(IrType type, IrId id, IrIntLiteral intLiteral, Offset offset)
	{
		super(id.getName(), offset);
		this.__type = type;
		this.__id = id;
		this.__arrSize = intLiteral;
	}

	public IrId getId()
	{
		return this.__id;
	}

	public void setType(IrType type)
	{
		this.__type = type;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.FIELD;
	}

	private IrType __type;
	private IrId __id;
	private IrIntLiteral __arrSize;
}
