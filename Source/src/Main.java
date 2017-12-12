import analyzer.Lexical;
import analyzer.Semantic;
import analyzer.Syntaxical;
import test.SyntaxAnalyzeTest;
import utils.OutputWriter;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.cli.*;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 28/Nov/2017
 */

public class Main
{
	private static void debug_parse(String srcFile, int mode) throws IOException
	{
		String input = new utils.ANTLRReader(srcFile).read();

		analyzer.Base analyzer = null;

		if (0 == mode)
			analyzer = new Lexical(input, srcFile);
		else
			analyzer = new Syntaxical(input, srcFile);

		Path p = Paths.get(srcFile);
		String srcout = Paths.get(null != p.getParent() ? p.getParent().toString() : "",
				p.getFileName().toString() + ".out").toString();
		OutputWriter ow = new OutputWriter(srcout);
		ow.write(analyzer.analyze());
	}

	private static void inter_parse(String srcFile) throws IOException
	{
		String input = new utils.ANTLRReader(srcFile).read();
		Semantic analyzer = new Semantic(input, srcFile);
		Path p = Paths.get(srcFile);
		String srcout = Paths.get(null != p.getParent() ? p.getParent().toString() : "",
				p.getFileName().toString() + ".out").toString();
		OutputWriter ow = new OutputWriter(srcout);
		ow.write(analyzer.analyze());

	}

    public static void main(String[] args) throws IOException
	{
		// parse arguments
		Option help = new Option("h", "help", false, "show help message");

		Option target =  new Option("target", true, "option mode of program");
		target.setRequired(true);
		target.setArgName("option");

		Option debug = new Option("debug", "run program as debug mode");

		Options options = new Options();
		options.addOption(help);
		options.addOption(target);
		options.addOption(debug);

		try
		{
			CommandLineParser parser = new DefaultParser();
			CommandLine cmd = parser.parse(options, args);

			if (cmd.hasOption("h"))
			{
				HelpFormatter helpFormatter = new HelpFormatter();
				helpFormatter.printHelp(
						"SimpleCode [-h] [-debug] -target <option> <SimpleCode_file>",
						options);
			}

			if (1 < cmd.getArgList().size())
			{
				throw new ParseException("Missing <SimpleCode_file>");
			}
			else if (1 > cmd.getArgList().size())
			{
				throw new ParseException("Unknown some arguments");
			}

			if (cmd.hasOption("target"))
			{
				String srcFile = cmd.getArgList().get(0);
				if (cmd.hasOption("debug"))
				{
					int mode = Integer.parseInt(cmd.getOptionValue("target"));
					debug_parse(srcFile, mode);
				}
				else
					inter_parse(srcFile);
			}
			else
				throw new ParseException("Missing target option");
		}
		catch (ParseException | NumberFormatException | IOException e)
		{
			e.printStackTrace();
		}

		//sai: parser/il14, semantics/il10
//        SyntaxAnalyzeTest test = new SyntaxAnalyzeTest("./src/semantics/illegal-17.dcf");
//        test.Run();

//		LexicalAnalyzeTest test = new LexicalAnalyzeTest("./src/scanner/ws1");
//		test.Run();
    }
}
