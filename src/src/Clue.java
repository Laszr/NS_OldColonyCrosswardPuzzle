import java.util.Objects;
import java.util.Scanner;

public class Clue
{
    private static int row;
    private static int col;
    private static int num;
    private static boolean isHorizontal;
    private static String answer;
    private static String clue;
    public static final String DELIMITER = ":";
    public static Scanner userInput = new Scanner(System.in);

    public Clue(int row, int col, boolean isHorizontal, int num, String answer, String clue)
    {
        this.row = row;
        this.col = col;
        this.isHorizontal = isHorizontal;
        this.num = num;
        this.answer = answer;
        this.clue = clue;
    }
    public static int getRow()
    { 
        return row; 
    }
    public static int getCol()
    { 
        return col; 
    }
    public static boolean getIsHorizontal()
    { 
        return isHorizontal;
    }
    public static int getNum()
    { 
        return num; 
    }
    public static String getAnswer()
    {
        return answer; 
    }
    public static String getClue()
    { 
        return clue; 
    }
    public static void chooseClue() {
        System.out.println("Horizontal or vertical? (type in h or v)");
        char horizontal = (char) Clue.userInput.nextByte();
        if (Objects.equals(horizontal, 'h'))
        {
            isHorizontal = true;
        }
        else
        {
            isHorizontal = false;
        }
    }

    public static String displayAllClues()
    {
        return "row: " + getRow() + "col: " + getCol() + "number: " + getNum() + "horizontal? " + getIsHorizontal() + "Answer: " + getAnswer() + "Clue: " + getClue();
    }
    @Override
    public String toString() 
    {
        return getNum() + DELIMITER + " " + getClue();
    }
}