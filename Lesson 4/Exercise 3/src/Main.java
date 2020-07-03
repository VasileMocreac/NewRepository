import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int Digit;
        Digit = num % 10;
        sum = sum + Digit;
        num = num / 10;
        Digit = num % 10;
        sum = sum + Digit;
        num = num / 10;
        sum = sum + num;
        System.out.println(sum);


    }
}
