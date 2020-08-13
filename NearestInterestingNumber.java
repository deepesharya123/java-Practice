import java.util.Scanner;

public class NearestInterestingNumber {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int a= in.nextInt();
		
		int i=0,run=1;
		while(run!=0) {
			int n = a+i;
			i++;

			int sum=0;
			int cn = n;
			while(cn!=0) {
				int r= cn%10;
				cn=cn/10;
				sum=sum+r;
			}
			if(sum%4==0&&sum>0) {
				cn=n;
				System.out.println(cn);
				run=0;
				break;
			}
			
			
		}
		
	}
}
