// find repeating numbers in an array
public class repeatedNum {

    public static void repnum(int arr[], int arr_size) {

        String same = " ";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    same += arr[i] + " ";
                }
            }
        }
        System.out.println(same.strip());

    }

    public static void main(String[] args) {
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int arr_size = arr.length;
        repnum(arr, arr_size);
    }

}
