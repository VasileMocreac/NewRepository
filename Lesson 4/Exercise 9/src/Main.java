import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean b1 = (0 >= a || 0 >= b || 0 >= c);
        System.out.println(b1);

        int e = scanner.nextInt();
        int f = scanner.nextInt();
        int g = scanner.nextInt();

        boolean b2 = (0 >= e || 0 >= f || 0 >= g);
        System.out.println(b2);


    }
}
