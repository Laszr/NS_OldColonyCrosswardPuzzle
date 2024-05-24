import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Crossword 
{
    public Square[][] crossword;

    public static final char ASTERISK = '*';

    // Decides whether the program should print out an empty (complete) space or an asterisk.
    public Crossword(boolean[][] grid) 
    {
        crossword = new Square[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j]) 
                {
                    crossword[i][j] = new Square(' ');
                } 
                else 
                {
                    crossword[i][j] = new Square(ASTERISK);
                }
            }
        }
    }

    //Prints out the content of the crossword.
    @Override
    public String toString()
    {
        String emptyString = "";
        for (Square[] squares : crossword)
        {
            for (int index = 0; index < crossword[0].length; index++)
            {
                emptyString.indent(squares[index].getSquareContent()).indent(Integer.parseInt("  \n"));
            }
        }
        return emptyString.toString();
    }
}