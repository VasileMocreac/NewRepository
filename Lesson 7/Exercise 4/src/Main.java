import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();
        String array1[]= str.split(str);
        String[] dateArray = str.split("-");
        System.out.println(Arrays.toString(dateArray));
        

        }
    }
}
