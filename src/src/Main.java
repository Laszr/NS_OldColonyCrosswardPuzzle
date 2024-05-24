/*
Name: Nadeem Sassin
Assignment: Junior DDM
Date: 5/22/24
Description: Create a crossword puzzle based off of students in CS!!!!
 */

import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class Main {
    public static int col = 4;
    public static int row = 4;

    public static final File textFile = new File("TextFile.txt");

    // Main function; initializes the area of the crossword and prints out the user's choice/crossword itself.
    public static void main(String[] args) throws IOException {

        boolean[][] puzzleArea = new boolean[row][col];
        Crossword crossword = new Crossword(puzzleArea);
        userChoice();
        System.out.println(crossword);
    }

    // Gives the user their choices and is intended to give proper response.
    public static void userChoice() throws IOException {
        int switchCase;
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Choose an option: \n1. Display all clues \n2. Display specific clue \n3. Erase answer \n4. Submit puzzle \n5. Exit \nEnter your choice: ");
            switchCase = input.nextInt();
            if (switchCase > 5 || switchCase < 1) {
                System.out.println("Invalid choice.");
            } else if (switchCase == 5) {
                break;
            } else {
                switch (switchCase) {
                    case 1:
                        System.out.println("Displaying all clues:");
                        Clue.displayAllClues();
                        break;
                    case 2:
                        System.out.println("Displaying one clue:");
                        Clue.chooseClue();
                        break;
                    case 3:
                        System.out.println("Erasing answer:");
                        fileHandler.eraseAnswer();
                        break;
                    case 4:
                        System.out.println("Submitting puzzle:");
                        fileHandler.readClues();
                        break;
                }
            }
        }
    }
}
