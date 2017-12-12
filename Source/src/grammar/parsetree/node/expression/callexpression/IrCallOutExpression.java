package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.literal.IrStringLiteral;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public class IrCallOutExpression extends IrBaseCallExpression
{
	public IrCallOutExpression(IrStringLiteral stringLiteral, Offset offset)
	{
		super(stringLiteral.getName(), offset);
		this.__stringLiteral = stringLiteral;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.CALL_OUT;
	}
	private IrStringLiteral __stringLiteral;
}
