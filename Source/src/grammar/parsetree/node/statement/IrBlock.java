package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.vardecl.IrVarDecl;

import java.util.ArrayList;
import java.util.List;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public class IrBlock extends IrBaseStatement
{
	public IrBlock()
	{
		this.__statements = new ArrayList<>();
		this.__vars = new ArrayList<>();
	}

	public List<IrStatement> getStatement()
	{
		return this.__statements;
	}

	public void push(IrStatement statement)
	{
		this.__statements.add(statement);
	}

	public void push(IrVarDecl varDecl)
	{
		this.__vars.add(varDecl);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.BLOCK;
	}

	private List<IrStatement> __statements;
	private List<IrVarDecl> __vars;
}
