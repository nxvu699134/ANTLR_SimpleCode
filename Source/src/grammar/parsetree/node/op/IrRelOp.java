package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

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
