package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ANTLRReader
{
    public ANTLRReader(String FileName)
    {
        this.FileName = FileName;
    }

    public String read() throws IOException
    {
        try (BufferedReader br = new BufferedReader(new FileReader(this.FileName)))
        {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (null != line)
            {
                sb.append(line);
                sb.append("\n");
                line = br.readLine();
            }
            return sb.toString();
        }

    }
    private String FileName;
}
