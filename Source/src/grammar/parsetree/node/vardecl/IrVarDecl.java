package grammar.parsetree.node.vardecl;

import grammar.parsetree.node.IrBaseNode;

import java.util.ArrayList;
import java.util.List;

public class IrVarDecl extends IrBaseNode
{
	public IrVarDecl()
	{
		this.__vars = new ArrayList<>();
	}

	public void push(IrVar var)
	{
		this.__vars.add(var);
	}

	private List<IrVar> __vars;
}
