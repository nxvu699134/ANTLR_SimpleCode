package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

public class IrArithOp extends IrBaseOp
{


	public IrArithOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public OpType getOpType()
	{
		return OpType.ARITH;
	}
}
