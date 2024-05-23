import java.io.*;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
public class Square
{
    private char squareContent;
    public Square(char squareContent)
    {
        this.squareContent = squareContent;
    }
    public char getSquareContent()
    {
        return squareContent;
    }
    public void setSquareContent(char squareContent)
    {
        this.squareContent = squareContent;
    }
    @Override
    public String toString()
    {
        return Character.toString(squareContent);
    }
}