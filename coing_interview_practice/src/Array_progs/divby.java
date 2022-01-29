package Array_progs;

public class divby {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 8, 9,10 };

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 4 == 0 || arr[i] % 9 == 0) {
                System.out.println(arr[i]);

            }
        }
    }
}
