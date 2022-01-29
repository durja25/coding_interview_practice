package Array_progs;

public class arrsum {

    public static int sum(int arr[]){
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            if (prime(arr[i])==false) {
                
                sum += arr[i];
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean prime(int n) {

        // Check if n is less then 1 or equal to 1
        int m = n/2;
        if (n<=1) {
            return false;
        
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
        int arr[] = {1, 14, 5, 7};
        // isPrime(arr);
        System.out.println(sum(arr));

    }
    
}
