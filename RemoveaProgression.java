import java.util.Scanner;
import java.util.Vector;

public class ecr93_A {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int[] res = new int[t];
		int i ;
		
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			
			int ans = m*2;
			res[i]=ans;
			
		}
		
		
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
		
	}
	
}



//1
//15
//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
//11
//12
//13
//14
//15
