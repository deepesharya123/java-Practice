import java.util.Scanner;

public class LuckyYear {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		
		int n = in.nextInt();
		
		if(n<10) {
			System.out.println("1");
		}
//		else if(n>=5&&n<10) {
//			System.out.println(10-n);
//		}
		else {
//			400=> 500
//			5000=>6000
//			23000=>30000
//			201 => 300
//			200=>300
			
			
			int d=0;
			int cn=n;
			int ans=0;
			while(cn!=0) {
				d++;
				ans=cn%10;
				cn=cn/10;
			}
			
			int[] ar= new int[d];
			ar[0]=ans+1;
			int i;
			String s="";
			
			int res=0;
			for(i=0;i<d;i++) {
//				System.out.println(ar[i]);
				res=res*10+ar[i];
			}
			System.out.println(res-n);
			
		}
		
		
	}
	
}
