package Array_progs;

public class maxdiff {
    // Max difference between two elements of array.
    public static void main(String[] args) {
        // int arr []= {4, 2, 4, 5, 2, 3, 1};
        int arr[] = { 4, 7, 4, 5, 2, 8, 10 };
        // int arr[] = {1, 2, 90, 10, 110};
        int maxdiffer = arr[1] - arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxdiffer) {
                    maxdiffer = arr[j] - arr[i];
                }

            }
        }
        System.out.println(maxdiffer);

    }

}
