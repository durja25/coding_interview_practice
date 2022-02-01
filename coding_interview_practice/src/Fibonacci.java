import java.util.Scanner;

/**
 * fibonacci
 */
public class Fibonacci {

    static int fib(int n) {
        if (n <= 1)
            return n;

        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.println("input int ");
            int n = sc.nextInt();
            System.out.println("input:" + n);
            
            System.out.println(fib(n));
        }
    }
}