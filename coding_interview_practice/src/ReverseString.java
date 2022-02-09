// reverse string with replacing space with % 
public class ReverseString {

    // Reverse String with split
    // public static void main(String[] args) {
    // String sen[] = "i like this program very much maybe".split(" ");

    // String rev = "";

    // for (int i = sen.length - 1; i >= 0; i--) {
    // rev += sen[i] + "%";

    // }
    // System.out.println("reversed:"+rev.strip());
    // System.out.println(sen.length);
    // }

    // using char array
    private static String Reverse(String str) {
        char[] chars = str.toCharArray();
        int charslen = chars.length;
        char temp;
        for (int i = 0; i < charslen / 2; i++) {
            temp = chars[i];
            chars[i] = chars[charslen - 1 - i];
            chars[charslen - 1 - i] = temp;

        }

        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String str = "null";
        System.out.println(Reverse(str));
    }

}
