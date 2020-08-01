import java.util.Scanner;

public class FreeIceCream {
	public static void main(String[] args ) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
//		in.nextLine();
//		String s= in.nextLine();
//		System.out.println(s+n);		
		long x = in.nextLong();
			
		int gi=0;
		int ta=0;
		int[] a = new int[n];
		int k=0;
		int i;
		int sum=0;
		long ts=x;
		int nahi=0;
		long ghat=0;
		for(i=0;i<n;i++) {
			in.nextLine();
			char c = in.next().charAt(0);
					
			int num = in.nextInt();
			
			if(c=='+') {
				x=x+num;
				ts=ts+num;
			}
			else {
				if(x>=num) {
					x=x-num;
					ghat=ghat+num;
				}else {
					a[k]=num;
					gi++;
					k++;
					nahi=nahi+num;
				}
				
				
			}
			
			
		}
		nahi=0;
		for(i=0;i<k;i++) {
//			System.out.println(a[i]);
			nahi=nahi+a[i];
		}
//		System.out.println(nahi);
//		System.out.println(ts);
		ts=ts-ghat;
		System.out.println(ts+" "+gi);
		
		
		
		
		
		
	}
	
}
