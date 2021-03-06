package utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * User: innovation
 * Author: Nguyen Xuan Vu
 * Date: 12:09 PM, 28/Nov/2017
 */

public class OutputWriter
{
	public OutputWriter(String filename)
	{
		this.filename = filename;
	}

	public void write(String content)
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(this.filename)))
		{
			bw.write(content);
			bw.flush();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private String filename = "";
}
