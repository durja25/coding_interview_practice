package Array_progs;

import java.util.Arrays;

public class ArrayInsert {
	
	static int insertEle(int oarr[],int insert) {
		int size = oarr.length;
		int newarr[] = new int[size+1];
		for (int i = 0; i < oarr.length; i++) {
			newarr[i] += oarr[i];
		}
		newarr[size] += insert;
		System.out.println(Arrays.toString(newarr));
		return 1;
	}
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 6, 8, 9,10 };
		int f = 7;
		
		System.out.println(insertEle(arr, f));
		
	}

}
