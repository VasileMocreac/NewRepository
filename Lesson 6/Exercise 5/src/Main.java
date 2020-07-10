import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) { //rows
            for (int j = 0; j < n; j++) { //columns
                array[i][j] = Math.abs(j - i);
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
