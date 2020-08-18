package advancedMethods;
import java.util.Scanner;

public class operators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		scan.close();
		
		System.out.println((a>b)?a:b);
		
		add2 test = (int c, int d) -> {return c+d;};
		int e = test.add(5, 10);
		System.out.println(e);
		
	}
}
