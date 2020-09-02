import java.util.Scanner;
import java.time.LocalDate;
public class Main {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse(new Scanner(System.in).nextLine());
        System.out.println(localDate.minusYears(30));
        System.out.println(localDate.plusYears(30));

    }
}
