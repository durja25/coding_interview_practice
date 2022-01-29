import java.util.Scanner;

public class FyoldTriangle {

	private static Scanner in;

	public static void main(String[] args) {
		int n, num = 1, c, d;
		in = new Scanner(System.in);
		System.out.println("enter the number of row of floyd's tringle you want");
		// n = 5;
		n = in.nextInt();
		System.out.println("floyd's tringle:-");
		for (c = 1; c <= n; c++) {
			for (d = 1; d <= c; d++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
		in.close();
	}

}
