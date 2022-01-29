import java.util.Scanner;

public class converttos {
    //how to convert seconds to hours/minutes/seconds?
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Give seconds to convert:");
		int input=sc.nextInt(); 
		int hours=input/3600;
		int minutes=(input%3600)/60;
		int seconds=(input%3600)%60;
		System.out.println("hours:"+hours);
		System.out.println("minutes:"+minutes);
		System.out.println("seconds:"+seconds);
		sc.close();
	}
    
}
