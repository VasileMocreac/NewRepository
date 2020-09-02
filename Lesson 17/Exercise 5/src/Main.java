import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hours = sc.nextInt();
        int minutes = sc.nextInt();
        LocalTime time = LocalTime.parse(str);
        System.out.println(time.minusHours(hours).minusMinutes(minutes));


    }
}
