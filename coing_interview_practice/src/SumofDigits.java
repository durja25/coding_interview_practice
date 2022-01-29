// Sum of a digit of a number like 467=17  
public class SumofDigits {

    // static int getsum(int n){

    //     int sum;
    //     for(sum = 0;n>0;sum += n % 10, n /= 10 ){

    //     }
    //     return sum;
    // }
    // public static void main(String[] args) {
    //     int n = 467;
    //     System.out.println(getsum(n));

    // }

    // String addtion of digits
    static int getsum(String str){
        int sum = 0;
        for(int i=0; i<str.length();i++){
            sum = sum +str.charAt(i) - 48;
        }
        return sum;
    }
    public static void main(String[] args) {
        String st = "467";
        System.out.println(getsum(st));
    }

}
