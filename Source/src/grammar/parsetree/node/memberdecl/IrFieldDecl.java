package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

import java.util.ArrayList;
import java.util.List;

public class IrFieldDecl extends IrBaseMemberDecl
{
	public IrFieldDecl(Offset offset)
	{
		super("", offset);
		this.__fields = new ArrayList<>();
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.FIELD_DECL;
	}
	public void push(IrField field)
	{
		this.__fields.add(field);
	}

	private List<IrField> __fields;
}
