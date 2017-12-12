package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.IrBaseNode;
import grammar.parsetree.node.Offset;

import java.util.ArrayList;
import java.util.List;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 04/Dec/2017
 */

public abstract class IrBaseMemberDecl extends IrBaseNode implements IrMemberDecl
{
	IrBaseMemberDecl(String name, Offset offset)
	{
		super(name, offset);
	}
}
