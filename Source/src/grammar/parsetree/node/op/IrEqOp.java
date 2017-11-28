package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

public class IrEqOp extends IrBaseOp
{
	public IrEqOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public OpType getOpType()
	{
		return OpType.EQ;
	}
}
