package grammar.parsetree.node.expression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.type.IrType;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 01/Dec/2017
 */

public interface IrExpression extends IrNode
{
	IrExpression getExpression();
	IrType getType();
	void setType(IrType type);
}
