import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        int i = sc.nextInt();
        switch (i) {
            case 0:
                st += "Do Not Move";
                break;
            case 1:
                st += "Move Up";
                break;
            case 2:
                st += "Move Down";
                break;
            case 3:
                st += "Move Left";
                break;
            case 4:
                st += "Move Right";
                break;
            default:
                st = "Error";
        }
        System.out.println(st);
    }
}