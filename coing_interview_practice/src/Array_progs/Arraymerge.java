package Array_progs;
// Merge Two arrays

import java.util.*;

public class Arraymerge {

    // public static void main(String[] args) {
    //     int arr[] = { 12, 35, 1, 10, 34, 1 };
    //     int arr1[] = { 8, 15, 1, 10, 4, 2 };
    //     int arrlen = arr.length;
    //     int arr1len = arr1.length;
    //     int arrresult[] = new int[arrlen + arr1len];
    //     System.arraycopy(arr, 0, arrresult, 0, arrlen);
    //     System.arraycopy(arr1, 0, arrresult, arrlen, arr1len);
    //     // System.arraycopy(src, srcPos, dest, destPos, length);
    //     System.out.println(Arrays.toString(arrresult));

    // }

    public static void main(String[] args) {
    int arr[] = { 12, 35, 1, 10, 34, 1 };
    int arr1[] = { 8, 15, 1, 10, 4, 2 };
    int length = arr.length + arr1.length;

    int merged [] = new int[length];
    int pos = 0;

    for (int i : arr) {
        merged[pos] = i;
        pos++;

        
    }

    for (int i : arr1) {
        merged[pos] = i;
        pos++;
        
    }
    System.out.println(Arrays.toString(merged));
    
    
    }

}
