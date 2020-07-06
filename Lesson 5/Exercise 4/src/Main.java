import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = "";
        String s = sc.nextLine();
        switch (s) {
            case "gryffindor":
                st += "bravery";
                break;
            case "hufflepuf":
                st += "loyalty";
                break;
            case "slytherin":
                st += "cunning";
                break;
            case "ravenclaw":
                st += "intellect";
                break;
            default:
                st = "not a valid house";
        }
        System.out.println(st);
    }
}
