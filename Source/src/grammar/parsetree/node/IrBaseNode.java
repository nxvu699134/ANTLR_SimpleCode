package grammar.parsetree.node;

public abstract class IrBaseNode implements IrNode
{
	public IrBaseNode(String name, Offset offset)
	{
		this._name = name;
		this._offset = offset;
	}

	public IrBaseNode(String name)
	{
		this._name = name;
	}
	public IrBaseNode(){}

	@Override
	public String getName()
	{
		return this._name;
	}

	@Override
	public Offset getOffset()
	{
		return this._offset;
	}

	@Override
	public NodeType getNodeType()
	{
		return NodeType.OTHER;
	}


	protected String _name = "";
	protected Offset _offset;

}
