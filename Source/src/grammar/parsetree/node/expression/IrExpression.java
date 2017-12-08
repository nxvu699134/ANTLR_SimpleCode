package grammar.parsetree.node.expression;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.type.IrType;

public interface IrExpression extends IrNode
{
	IrExpression getExpression();
	IrType getType();
	void setType(IrType type);
}
