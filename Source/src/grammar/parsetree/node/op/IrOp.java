package grammar.parsetree.node.op;

import grammar.parsetree.node.IrNode;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public interface IrOp extends IrNode
{
	OpType getOpType();
}
