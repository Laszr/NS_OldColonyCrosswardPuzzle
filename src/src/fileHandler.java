import java.io.*;
import java.util.Scanner;

public class fileHandler
{
    public static Clue[][] clueList;
    public static final File textFile = new File("TextFile.txt");
    public static final String ASTERISK = "*";
    public static void readClues() throws IOException
    {
        for (int i = 0; i < clueList.length; i++)
        {
            for (int j = 0; j < clueList[0].length; j++)
            {
                Scanner fileReader = new Scanner(textFile);
                while (fileReader.hasNextLine())
                {
                    String reader = fileReader.nextLine();
                    System.out.println(reader);
                }
            }
        }
    }
    public static void eraseAnswer() throws IOException
    {
        for (int i = 0; i < clueList.length; i++)
        {
            for(int j = 0; j < clueList.length; j++)
            {
                Scanner fileReader = new Scanner(textFile);
                while (fileReader.hasNextLine() && fileReader != null)
                {
                    String reader = fileReader.nextLine();
                    reader = ASTERISK;
                    System.out.println(reader);
                }
            }
        }
    }

    @Override
    public String toString()
    {
        return null;
    }
}