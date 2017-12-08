package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.literal.IrStringLiteral;
import grammar.parsetree.node.id.IrId;

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
