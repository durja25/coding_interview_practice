public class Palindrom {

    public static boolean check(String inString) {
        String reversedString = reverse(inString);
        String originalString = inString;
        if (reversedString.equals(originalString)) {
            return true;

        }
        return false;
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

    public static boolean isPalindrome(String text) {
        final int length = text.length();
        for (int idx = 0; idx < length / 2; idx++) {
            if (text.charAt(idx) != text.charAt(length - 1 - idx))
                return false;
        }
        return true;
    }



    public static void main(String[] args) {
        String s = "aaaa";
        // reverse(s);
        // System.out.println(reverse(s));
        // System.out.println("check : " + check(s));
        System.out.println("check : " + isPalindrome(s));

        
    }

}
