package grammar.parsetree.node.vardecl;

import grammar.parsetree.node.IrBaseNode;

import java.util.ArrayList;
import java.util.List;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

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
