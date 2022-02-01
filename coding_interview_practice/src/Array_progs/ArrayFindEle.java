package Array_progs;


public class ArrayFindEle {
	
	static boolean FindEle(int arr[],int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return true;
				
			}
		}
		return false;
			
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 6, 8, 9,10 };
		int f = 7;
		
		System.out.println("Found:"+ FindEle(arr, f)+":"+ f);
		
	}
}
