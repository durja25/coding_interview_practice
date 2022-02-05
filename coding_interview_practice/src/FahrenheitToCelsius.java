
import java.util.Scanner;

public class FahrenheitToCelsius {

    private static Scanner in;

    public static void main(String[] args) {
        float Celsius;
        in = new Scanner(System.in);
        System.out.println("enter value of fe");
        Celsius = in.nextInt();
        Celsius = ((Celsius - 32) * 5) / 9;
        System.out.println("temp in Celsius=" + Celsius);

    }
}
