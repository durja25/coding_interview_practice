import java.util.Scanner;

public class TipCalc {

    // program for calculator demo

    public static void main(String[] args) {
        double rate1 = 0.1;
        double rate2 = 0.15;
        double rate3 = 0.2;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter the purchase price:");
        double total = keyboard.nextDouble();
        System.out.printf("10%%:%.2f\n", (total * rate1));
        System.out.printf("15%%:%.2f\n", (total * rate2));
        System.out.printf("20%%:%.2f\n", (total * rate3));
    }

}
