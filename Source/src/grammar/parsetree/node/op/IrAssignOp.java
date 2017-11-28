package grammar.parsetree.node.op;

import grammar.parsetree.node.Offset;

public class IrAssignOp extends IrBaseOp
{
	public IrAssignOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public OpType getOpType()
	{
		return OpType.ASSIGN;
	}
}
