package grammar.parsetree.node.statement;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.expression.IrExpression;

public class IrIfStatement extends IrBaseStatement
{
	public IrIfStatement(IrExpression expr, IrBlock trueBlock, IrBlock elseBlock, Offset offset)
	{
		super("if", offset);
		this.__expr = expr;
		this.__trueBlock = trueBlock;
		this.__elseBlock = elseBlock;
	}

	public void setTrueBlock(IrBlock block)
	{
		this.__trueBlock = block;
	}

	public void setElseBlock(IrBlock block)
	{
		this.__elseBlock = block;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.IF;
	}

	private IrExpression __expr;
	private IrBlock __trueBlock;
	private IrBlock __elseBlock;
}
