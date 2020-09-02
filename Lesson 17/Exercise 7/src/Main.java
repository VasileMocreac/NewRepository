import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDateTime time = LocalDateTime.parse(scanner.next());
        System.out.print(time.plusDays(scanner.nextInt()).minusHours(scanner.nextInt()));
    }
}
