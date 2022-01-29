package Array_progs;

public class primearray {

    public static int isPrime(int arr[]){
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {1, 14, 5, 7};
        // isPrime(arr);
        System.out.println(isPrime(arr));

    }

}
