import java.io.*;
public class Throws
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aasif\\OneDrive\\Desktop\\demo.txt"));
        String line;
        while ((line = br.readLine()) != null)
        {
            System.out.println(line);
        }
        br.close();
    }
}
