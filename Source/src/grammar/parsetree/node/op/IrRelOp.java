package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public class IrRelOp extends IrBaseOp
{
	public IrRelOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public OpType getOpType()
	{
		return OpType.REL;
	}
}
