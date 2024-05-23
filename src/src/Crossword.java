import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Crossword 
{
    public Square[][] crossword;

    public static final char ASTERISK = '*';
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

    @Override
    public String toString()
    {
        String emptyString = "";
        for (Square[] squares : crossword)
        {
            for (int j = 0; j < crossword[0].length; j++)
            {
                emptyString.indent(squares[j].getSquareContent()).indent(Integer.parseInt("  \n"));
            }
        }
        return emptyString.toString();
    }
}