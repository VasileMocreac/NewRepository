import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Make the field.
        char[][] field = new char[9][9];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = '.';
            }
        }
        // How many mines should be on the field.
        Scanner sc = new Scanner(System.in);
        System.out.println("How many mines do you want on the field? ");
        int numMines = sc.nextInt();

        // Set mines one the field.
        Random random = new Random();
        int minesPlaced = 0;
        while (minesPlaced < numMines) {
            int mineRow = random.nextInt(9);
            int mineCol = random.nextInt(9);
            field[mineRow][mineCol] = 'X';
            minesPlaced++;
        }
        // Print field.
        for (char[] chars : field) {
            for (char spot : chars) {
                System.out.print(spot);
            }
            System.out.println();
        }
    }
}