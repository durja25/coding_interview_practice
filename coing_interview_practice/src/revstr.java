// import java.util.Arrays;

public class revstr {

    // Reverse Sentence
    // static String reverse(String str){
    //     String rev = "";
    //     String sena[] = str.split(" ");
    //     for (int i = sena.length - 1; i >= 0; i--) {
    //         rev += sena[i] + " ";


    //     }

    //     return rev;
    // }
    static String reverse(String str){
        String rev = "";
        String sena[] = str.split(" ");
        // for (int i = sena.length - 1; i >= 0; i--) {
        //     rev += sena[i] + " ";


        // }
        for (int i = 0; i < sena.length; i++) {
            if (i%2==1) {

                sena[i] = reverseword(sena[i]) ;
            }
                rev =rev +" "+ sena[i];

        }

        return rev;
    }

    // Reverse words
    public static String reverseword(String input){
        if(input == null || input.isEmpty()){
            return input;
        }
       
        return input.charAt(input.length()- 1) 
                   + reverseword(input.substring(0, input.length() - 1));
    }
    public static void main(String[] args) {
        String sen = "i like this program very much maybe";

        System.out.println(reverse(sen));
    }

}
// // Reverse alternate words in sen
// public class test {

//     public static void main(String[] args) {

//         String s = "i.like.this.program.very.much.maybe";

//         String result = reverseAltWords(s);

//         System.out.println(result.substring(1));

//     }

//     public static String reverseAltWords(String s)

//     {

//         String[] str = s.split("\\.");

//         String r = "";

//         for (int i = 0; i < str.length; i++)

//         {

//             if (i % 2 == 1)

//             {

//                 str[i] = reverse(str[i]);

//             }

//             r = r + "." + str[i];

//         }

//         return r;

//     }

//     public static String reverse(String s)

//     {

//         String rev = "";

//         for (int i = s.length() - 1; i >= 0; i--)

//         {

//             rev = rev + s.charAt(i);

//         }

//         return rev;

//     }

// }