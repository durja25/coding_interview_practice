package Array_progs;
import java.util.*;
public class ArrayFindsmallest {

    public static void main(String[] args) {
        int a [] = { 8, 15, 1, 10, 4, 2 };
        Arrays.sort(a);
        System.out.println(a[0]);

        // Without sort with temp var

        int temp, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;
  
        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            }
        }
        }
        System.out.println("2nd Smallest element of the array is:: "+array[0]);
    
    }
    
}
