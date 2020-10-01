import java.util.Scanner;

public class AlexandaRhombus {

	public static void main(String args[]) {
		Scanner in = new Scanne(System.in);
		int n = in.nextInt();
		int m=n-1;
		m*=m;
		n*=m;
		int s = (n)+(m);
		System.out.println(s);
	}
	
	
}
