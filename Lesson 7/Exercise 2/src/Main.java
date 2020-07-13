import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameCity = sc.nextLine();
        System.out.println(nameCity.endsWith("burg"));
    }
}
