import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        // size of array
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int maxSeq = 1;
        int currentSeq = 1;
        // elements of array separated by spaces
        for (int i = 1; i < size; i++) {
            if (arr[i - 1] < arr[i]) {
                currentSeq++;
                if (currentSeq > maxSeq) {
                    maxSeq = currentSeq;
                }
            } else {
                currentSeq = 1;
            }
        }
        System.out.println(maxSeq);
    }
}
