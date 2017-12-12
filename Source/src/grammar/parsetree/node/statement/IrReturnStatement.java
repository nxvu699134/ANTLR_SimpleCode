package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrExpression;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public class IrReturnStatement extends IrBaseStatement
{
	public IrReturnStatement(IrExpression expr, Offset offset)
	{
		super("return", offset);
		this.__expr = expr;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.RETURN;
	}

	private IrExpression __expr;
}
