import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalTime time = LocalTime.parse(new Scanner(System.in).next());
        System.out.println(time.withSecond(0));
    }
}
