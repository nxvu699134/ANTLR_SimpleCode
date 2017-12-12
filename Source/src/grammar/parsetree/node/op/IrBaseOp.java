package grammar.parsetree.node.op;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public abstract class IrBaseOp extends IrBaseNode implements IrOp
{
	IrBaseOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public abstract OpType getOpType();
}
