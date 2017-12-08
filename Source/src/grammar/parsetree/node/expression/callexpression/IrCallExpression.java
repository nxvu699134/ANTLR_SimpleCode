package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.statement.IrStatement;

public interface IrCallExpression extends IrStatement
{
	void pushArg(IrNode arg);
	IrNode getArg(int i);
	int getArgCount();
}
