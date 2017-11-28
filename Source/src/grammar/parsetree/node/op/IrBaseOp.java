package grammar.parsetree.node.op;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

public abstract class IrBaseOp extends IrBaseNode implements IrOp
{
	IrBaseOp(String name, Offset offset)
	{
		super(name, offset);
	}

	@Override
	public abstract OpType getOpType();
}
