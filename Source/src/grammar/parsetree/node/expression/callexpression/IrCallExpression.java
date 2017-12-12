package grammar.parsetree.node.expression.callexpression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.statement.IrStatement;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public interface IrCallExpression extends IrStatement
{
	void pushArg(IrNode arg);
	IrNode getArg(int i);
	int getArgCount();
}
