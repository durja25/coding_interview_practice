package leetcode;

import java.util.HashMap;

public class Roman_to_Integer {
	/*
	 * int roman(char c) { switch (c) { case 'I': {
	 * 
	 * return 1; } case 'V': {
	 * 
	 * return 5; } case 'X': {
	 * 
	 * return 10;
	 * 
	 * } case 'L': { return 50; } case 'C': {
	 * 
	 * return 100; } case 'D': {
	 * 
	 * return 500; } case 'M': { return 1000; } } return -1;
	 * 
	 * }
	 */

	/*
	 * public int romanToInt(String s) { int sum = 0; int first =
	 * roman(s.charAt(0)); int second = 0; for (int j = 0; j < s.length() - 1; j++)
	 * { char ch = s.charAt(j); System.out.println(ch); second = roman(s.charAt(j +
	 * 1)); if (first >= second) { sum += first; } else { sum -= first; } first =
	 * second; } return sum+first; }
	 */
	public int romanToInt(String s) {
		HashMap<Character,Integer> check = new HashMap<>();
        //Putting value sinto hashmap
        check.put('I',1);
        check.put('V',5);
        check.put('X',10);
        check.put('L',50);
        check.put('C',100);
        check.put('D',500);
        check.put('M',1000);
        
        int sum = check.get(s.charAt(s.length()-1));
        for (int i = s.length()-2; i >=0 ; i--) {
        	if (check.get(s.charAt(i))<check.get(s.charAt(i+1))) {
        		sum -= check.get(s.charAt(i));
        					
			}else {
				sum +=check.get(s.charAt(i))
			}
			
		}
		
	}
	public static void main(String[] args) {
		String s = "MCMXCIV";
		Roman_to_Integer obj = new Roman_to_Integer();
		System.out.println(obj.romanToInt(s));
	}
	
	
	
	
	
	
	
	
	
	
	
}
