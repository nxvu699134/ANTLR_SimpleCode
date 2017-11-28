package grammar.parsetree.node.memberdecl;

import grammar.parsetree.node.NodeType;
import grammar.parsetree.node.Offset;

public class IrFieldDecl extends IrBaseMemberDecl
{
	@Override
	public NodeType getNodeType()
	{
		return NodeType.FIELD_DECL;
	}
}
