package grammar.parsetree.symtab;

import grammar.parsetree.node.IrNode;
import grammar.parsetree.node.NodeType;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SymbolTable
{
	public SymbolTable(SymbolTable outer, IrNode owner)
	{

		setOuter(outer);
		this.__owner = owner;
		this.__table = new Hashtable<>();
		this.__children = new ArrayList<>();
	}

	public SymbolTable getOuter()
	{
		return this.__outer;
	}

	private void setOuter(SymbolTable outer)
	{
		this.__outer = outer;
		if (null != outer)
			outer.addChild(this);
	}

	public List<IrNode> localLookUp(String name)
	{
		Symbol key = Symbol.symbol(name);
		return this.__table.get(key);
	}

	public IrNode localLookUp(String name, NodeType nodeType)
	{
		Symbol key = Symbol.symbol(name);
		List<IrNode> lst = this.__table.get(key);
		if (null != lst)
		{
			for (IrNode e : lst)
			{
				if (nodeType == e.getNodeType())
					return e;
			}
		}
		return null;
	}

	public List<IrNode> globalLookup(String name)
	{
		Symbol key = Symbol.symbol(name);
		SymbolTable symTab = this;
		while (null != symTab)
		{
			List<IrNode> v = symTab.__table.get(key);
			if (null != v)
				return v;
			symTab = symTab.__outer;
		}
		return null;
	}

	public IrNode globalLookup(String name, NodeType nodeType)
	{
		Symbol key = Symbol.symbol(name);
		SymbolTable symTab = this;
		while (null != symTab)
		{
			List<IrNode> v = symTab.__table.get(key);
			if (null != v)
			{
				for (IrNode e : v)
				{
					if (e.getNodeType() == nodeType)
						return e;
				}
			}
			symTab = symTab.__outer;
		}
		return null;
	}
    public void push(String name, IrNode value)
    {
	    List<IrNode> lst = this.__table.computeIfAbsent(Symbol.symbol(name), k -> new ArrayList<>());
	    lst.add(value);
    }

	public void addChild(SymbolTable child)
	{
		this.__children.add(child);
	}

	public IrNode getOwner()
	{
		return this.__owner;
	}

	private SymbolTable __outer; //parent
	private IrNode __owner;
	private Hashtable<Symbol, List<IrNode>> __table;
	private List<SymbolTable> __children;

}
