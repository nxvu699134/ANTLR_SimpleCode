package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.id.IrId;
import grammar.parsetree.node.statement.IrBlock;
import grammar.parsetree.node.type.IrType;

import java.util.ArrayList;
import java.util.List;

public class IrMethodDecl extends IrBaseMemberDecl
{
	public IrMethodDecl(IrType type, IrId id, IrBlock block, Offset offset)
	{
		super(id.getName(), offset);
		this.__type = type;
		this.__id = id;
		this.__block = block;
		this.__args = new ArrayList<>();
	}

	public void pushArg(IrMethodArg arg)
	{
		this.__args.add(arg);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.METHOD_DECL;
	}
	List<IrMethodArg> __args;
	IrType __type;
	IrId __id;
	IrBlock __block;
}
