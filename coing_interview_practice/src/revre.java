// reverse string with replacing space with % 
public class revre {

    public static void main(String[] args) {
        String sen[] = "i like this program very much maybe".split(" ");

        String rev = "";

        for (int i = sen.length - 1; i >= 0; i--) {
            rev += sen[i] + "%";


        }
        System.out.println("reversed:"+rev.strip());
        System.out.println(sen.length);
    }
}
