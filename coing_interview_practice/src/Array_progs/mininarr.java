package Array_progs;

public class mininarr {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];

            }
        }
        System.out.println(min);
    }
}
