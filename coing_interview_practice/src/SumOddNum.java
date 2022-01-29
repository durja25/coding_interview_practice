import java.util.Arrays;


public class SumOddNum {

    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        int sumodd = 0;
        int sumeven = 0;
        int oddcount = 0;
        int evencount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evencount++;
            }else{

                oddcount++;
            }
        }
        int oddarr[] = new int[oddcount];
        int evenarr[] = new int[evencount];
        int oddi = 0;
        int eveni = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sumeven += arr[i];
                evenarr[eveni] = arr[i];
                eveni++;
            } else {
                sumodd += arr[i];
                oddarr[oddi] = arr[i];
                oddi++;
            }

        }
        System.out.println("sum of odd : " + sumodd);
        System.out.println("sum of even : " + sumeven);
        System.out.println("sum of oddarr : " + Arrays.toString(oddarr));
        System.out.println("sum of evenarr : " + Arrays.toString(evenarr));
    }

}
