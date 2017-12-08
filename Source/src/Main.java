import analyzer.Lexical;
import analyzer.Syntaxical;
import grammar.parsetree.node.Offset;
import grammar.parsetree.node.type.IrType;
import test.SyntaxAnalyzeTest;
import utils.OutputWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main
{
	private static void parse(String srcfile, int mode) throws IOException
	{
		String input = new utils.ANTLRReader(srcfile).read();

		analyzer.Base analyzer = null;

		if (0 == mode)
			analyzer = new Lexical(input, srcfile);
		else
			analyzer = new Syntaxical(input, srcfile);

		Path p = Paths.get(srcfile);
		String srcout = Paths.get(null != p.getParent() ? p.getParent().toString() : "",
				p.getFileName().toString() + ".out").toString();
		OutputWriter ow = new OutputWriter(srcout);
		ow.write(analyzer.analyze());
	}

    public static void main(String[] args) throws IOException
	{
		// parse arguments
//		final Map<String, List<String>> params = new HashMap<>();
//
//		List<String> options = null;
//		try
//		{
//			for (final String a : args)
//			{
//				if (a.charAt(0) == '-')
//				{
//					if (a.length() < 2)
//					{
//						throw new Exception("Error at argument " + a);
//					}
//
//					options = new ArrayList<>();
//					params.put(a.substring(1), options);
//				}
//				else if (options != null)
//				{
//					options.add(a);
//				}
//				else
//				{
//					throw new Exception("Illegal parameter usage");
//				}
//			}
//
//			//-------------------------------------------------
//			try
//			{
//				int mode = Integer.parseInt(params.get("target").get(0));
//				String filename = params.get("debug").get(0);
//				parse(filename, mode);
//			}
//			catch (NullPointerException ne)
//			{
//				throw new Exception("-target or -debug is not found");
//			}
//
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}

		//sai: parser/il14, semantics/il10
        SyntaxAnalyzeTest test = new SyntaxAnalyzeTest("./src/semantics/illegal-17.dcf");
        test.Run();

//		LexicalAnalyzeTest test = new LexicalAnalyzeTest("./src/scanner/ws1");
//		test.Run();

    }
}
