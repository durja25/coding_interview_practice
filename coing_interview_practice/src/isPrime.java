import java.security.Principal;

public class isPrime {

    public static boolean prime(int n) {

        // Check if n is less then 1 or equal to 1
        int m = n/2;
        if (n<=1) {
            return true;
        
        // Check if n is equal to 2
        }else if (n==2) {
            return true;
        
        // Check if n is a multiple of 2
        }else if (n%2==0) {
            return false;
            
        }
        // If not, then just check the odds
        // for (int i = 3; i < Math.sqrt(n); i+=2) {
        for (int i = 3; i < m; i+=2) {
            if (n%i==0) {
                return false;
                
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        if (prime(7)) {
            System.out.println("Its prime");
            
        }else{
            System.out.println("its composite");
        }

    }    
}
