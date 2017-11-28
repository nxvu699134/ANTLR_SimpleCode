package grammar.parsetree.node;

public class Offset
{
	public Offset(int line, int index)
	{
		this.__line = line;
		this.__index = index;
	}

	public int getLine()
	{
		return this.__line;
	}

	public int getIndex()
	{
		return this.__index;
	}

	private int __line;
	private int __index;
}
