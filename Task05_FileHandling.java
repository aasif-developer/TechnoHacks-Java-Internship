import java.io.*;
public class Task05_FileHandling
{
    public static void main(String[] args)
    {
        try
        {
            // Writing to file
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello from Java File Handling");
            fw.close();
            
            // Reading from file
            FileReader fr = new FileReader("data.txt");
            int ch;
            System.out.println("FILE CONTENTS:");
            while((ch = fr.read()) != -1)
            {
                System.out.print((char)ch);
            }

            fr.close();
        }
        catch(IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}