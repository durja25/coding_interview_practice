public class maxinarr {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 100, 10, 34, 1 };
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];


            }
        }
        System.out.println(max);
    }
}
