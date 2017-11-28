package grammar.parsetree.node.type;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

public class IrType extends IrBaseNode
{

	public IrType(String name, int size, Offset offset)
	{
		super(name, offset);
		this.__size = size;
	}

	public IrType(IrType type, Offset offset)
	{
		this._name = type._name;
		this._offset = offset;
		this.__size = type.__size;
	}

	public int getSize()
	{
		return this.__size;
	}

    public static final IrType INT = new IrType("int", 4, null);
	public static final IrType BOOLEAN = new IrType("boolean", 1, null);
	public static final IrType VOID = new IrType("void", 0, null);

	private int __size = 0;
}
