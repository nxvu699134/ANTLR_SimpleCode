package grammar.parsetree.node.expression;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public class IrLocation extends IrBaseExpression
{
	public IrLocation(String name, IrExpression expr, Offset offset)
	{
		super(name, expr, offset);
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.LOCATION;
	}
}