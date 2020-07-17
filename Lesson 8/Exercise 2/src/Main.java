import java.util.Scanner;

public class Main {
    public static boolean isVowel(char ch) {
        char input = Character.toLowerCase(ch);
        return input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
