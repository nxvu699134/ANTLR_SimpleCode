package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.IrNode;

public interface IrCallExpression extends IrNode
{
	void pushArg(IrNode arg);
	IrNode getArg(int i);
}
