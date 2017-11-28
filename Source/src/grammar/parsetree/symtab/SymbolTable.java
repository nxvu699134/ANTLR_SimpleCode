package grammar.parsetree.symtab;

import grammar.parsetree.node.IrNode;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class SymbolTable
{
    public SymbolTable(SymbolTable outer)
    {

    	setOuter(outer);
    	this.__table = new Hashtable<>();
    	this.__children = new ArrayList<>();
    }

    public void setOuter(SymbolTable outer)
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

    public void push(String name, IrNode value)
    {
	    List<IrNode> lst = this.__table.computeIfAbsent(Symbol.symbol(name), k -> new ArrayList<>());
	    lst.add(value);
    }

	public void addChild(SymbolTable child)
	{
		this.__children.add(child);
	}

	private SymbolTable __outer; //parent
	private Hashtable<Symbol, List<IrNode>> __table;
	private List<SymbolTable> __children;

}
