package grammar.exception;

import grammar.parsetree.node.Offset;

public class DuplicateDeclare extends Exception
{
	public DuplicateDeclare(String msg)
	{
		super(msg);
	}
}
