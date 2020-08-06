import java.util.Scanner;

public class SashaandSticks {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		long k = in.nextLong();
		
//		System.out.println(n+" "+k);
		
		long d = n/k;
//		System.out.println(d);
		if(d!=0) {
			if(d%2==0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
		else {
			System.out.println("YES");
		}
		
		
	}
	
	
}
