package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

public class IrCondOp extends IrBaseOp
{

	public IrCondOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public OpType getOpType()
	{
		return OpType.COND;
	}
}
