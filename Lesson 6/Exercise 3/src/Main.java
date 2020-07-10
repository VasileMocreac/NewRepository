import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // read array size
        int size = sc.nextInt();
        int[] array = new int[size];
        int sum = 0;

        // read elements of array
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        // read the number n
        int n = sc.nextInt();

        // calculate the sum
        for (int value : array) {
            if (value > n) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}
