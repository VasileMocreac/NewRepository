import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char ch = str.charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            } else {
                System.out.print(ch);
                System.out.print(count);
                ch = str.charAt(i);
                count = 1;
            }
        }
        System.out.print(ch);
        System.out.print(count);
        }
    }
