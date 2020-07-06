import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int army = sc.nextInt();
        if (army < 1) {
            System.out.println("No Army");
        } else if (army <= 19) {
            System.out.println("Pack");
        } else if (army <= 249) {
            System.out.println("Throng");
        } else if (army <= 999) {
            System.out.println("Zounds");
        } else {
            System.out.println("Legion");
        }
    }

}



