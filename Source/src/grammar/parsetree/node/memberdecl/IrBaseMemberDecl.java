package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

import java.util.ArrayList;
import java.util.List;

public abstract class IrBaseMemberDecl extends IrBaseNode implements IrMemberDecl
{
	IrBaseMemberDecl()
	{
		this.__fields = new ArrayList<>();
	}

	IrBaseMemberDecl(String name, Offset offset)
	{
		super(name, offset);
		this.__fields = new ArrayList<>();
	}

	public void push(IrField field)
	{
		this.__fields.add(field);
	}

	private List<IrField> __fields;
}
