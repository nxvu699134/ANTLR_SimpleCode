package grammar.parsetree.symtab;

import java.util.Dictionary;
import java.util.Hashtable;

public class Symbol
{
	public String toString()
	{
		return this.__name;
	}

	public static Symbol symbol(String name)
	{
		String k = name.intern();
		Symbol s = Symbol.__dict.get(k);
		if (null == s)
		{
			s = new Symbol(k);
			Symbol.__dict.put(k, s);
		}
		return s;
	}

	private static Dictionary<String, Symbol> __dict = new Hashtable<>();

	private Symbol(String name)
	{
		this.__name = name;
	}

	private String __name;
}
