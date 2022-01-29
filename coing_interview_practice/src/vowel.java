public class vowel {

    static boolean isvowel(char ch){
        ch = Character.toUpperCase(ch);
        return (ch == 'A'|| ch == 'E'|| ch == 'O' || ch == 'U' || ch == 'I');

    }

    static int itr(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (isvowel(str.charAt(i))) {
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "ganesh";
        System.out.println(itr(s));

    }
}
