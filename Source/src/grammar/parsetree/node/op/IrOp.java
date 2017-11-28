package grammar.parsetree.node.op;

import grammar.parsetree.node.IrNode;

public interface IrOp extends IrNode
{
	OpType getOpType();
}
