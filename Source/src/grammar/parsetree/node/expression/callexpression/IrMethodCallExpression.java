package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.id.IrId;

public class IrMethodCallExpression extends IrBaseCallExpression
{
	public IrMethodCallExpression(IrId methodName, Offset offset)
	{
		super(methodName.getName(), offset);
		this.__methodName = methodName;

	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.METHOD_CALL;
	}

	private IrId __methodName;
}
