import java.util.Scanner;

public class CreatingtheContest {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int[] ar = new int[n];
		int i;
		for(i=0;i<n;i++)
			ar[i]=in.nextInt();
		
		int[] res= new int[n];
		
		if(n==1) {
			System.out.println("1");
		}else {
			int lar=-1;
			
			for(i=0;i<n;i++) {
				int j=i;
				while(j+1<n&&ar[j+1]<=2*ar[j]) 
					j++;
				if(lar<j-i+1)
					lar=j-i+1;
				
				i=j;
			}
		
		System.out.println(lar);
		
		}
		
		
		
	}
	
}