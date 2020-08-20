import java.util.Scanner;

public class Primeministernotcontest {
	public static void main(String args[]) {
	
		Scanner in = new Scanner(System.in);
		
		int n =  in.nextInt();
		int[] ar = new int[n];
		
		int i,sum=0;
		int a=-1;
		int[] res=new int[n];
		int k=0;
		res[k]=1;
		k++;
		int count=0;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
			
			if(i==0) {
				a=ar[i];
			}
			sum=sum+ar[i];
		}
		int mjr = sum/2;
		mjr++;
		int win=a;
		int not=1;
		for(i=1;i<n;i++) {
			
			int nu = ar[i];
			nu=2*nu;
			if(a>=nu) {
//				System.out.println("ASD"+i);
				count++;
				win=win+ar[i];
				res[i]=i+1;
			}
	
		if(win>=mjr) {
//			if(count==0) count=1;
			System.out.println(count+1);
			
			for(i=0;i<n;i++) {
				if(res[i]!=0) {
					System.out.print(res[i]+" ");
				}

			}
			not=0;
			break;
		}
			
		}
		if(not==1) {
			System.out.println("0");
		}
		
	}	
}
