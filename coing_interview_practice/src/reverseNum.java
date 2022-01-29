public class reverseNum {

    public static void main(String[]args) {
        int num=123;
        int reversed=0;
        int temp=0;
        while (num>0){
            temp=num%10;
            reversed=reversed*10+temp;
            num=num/10;
            }
        System.out.println("reversed no is:"+reversed);
        
        
    }
    
}
