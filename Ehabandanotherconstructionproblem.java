import java.util.Scanner;

public class Ehabandanotherconstructionproblem {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		
		if(x==1) {
			System.out.println("-1");
		}
		else {
			int h = x/2;
			h=h+1;
			int d = h;
			System.out.println(d+" "+h);
		}
		
		
	}
	
}
