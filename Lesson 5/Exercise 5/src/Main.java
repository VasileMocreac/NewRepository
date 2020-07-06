import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;

        switch (sc.next()) {
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                System.out.println(a * b);
                break;

            case "circle":
                double r = sc.nextDouble();
                System.out.println(r * r * 3.14);
                break;

            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                System.out.println((a + b + c) / 2); // not sure if it's correct
                break;


        }
    }
}
