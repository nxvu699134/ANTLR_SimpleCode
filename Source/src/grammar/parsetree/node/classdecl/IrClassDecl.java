package grammar.parsetree.node.classdecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.memberdecl.IrMemberDecl;
import grammar.parsetree.symtab.SymbolTable;
import sun.awt.Symbol;

import java.util.ArrayList;
import java.util.List;

public class IrClassDecl extends IrBaseNode
{
	public IrClassDecl(String name)
	{
		super(name);
		this.__members = new ArrayList<>();
	}

	public void push(IrMemberDecl member)
	{
		this.__members.add(member);
	}


	private List<IrMemberDecl> __members;
}
