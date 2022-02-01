package leetcode;

public class Palindrome {
	public boolean isPalindrome(int x) {
		int org = x;
		int rev = 0 ;
		int temp = 0;
		while (org>0) {
			temp = org%10;
			rev = rev*10+temp;
			org /= 10;
		}
		if (x == rev) {
			return true;
			
		}else {
		return false;
		}
	}

	public static void main(String[] args) {
		int x = 121;
		Palindrome obj = new Palindrome();
		System.out.println(obj.isPalindrome(x));

	}
}
