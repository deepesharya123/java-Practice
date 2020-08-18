import java.util.Scanner;

public class ThreeIndices {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
//		System.out.println("ASDF");
		for(i=0;i<t;i++) {
			
			int n = in.nextInt();
			int j;
			int[] ar =  new int[n];
			for(j=0;j<n;j++)
			{
				ar[j]=in.nextInt();
			}
			int no=0;
			for(j=0;j<n-2;j++)
			{
				int a = ar[j];
				int b= ar[j+1];
				int c= ar[j+2];
//				System.out.println(j);
				if(b>a&&b>c) {
					no=1;
					System.out.println("YES");
					int x = j+1;
					int y = j+2;
					int z = j+3;
					
					System.out.println(x+" "+y+" "+z);
					break;
				}
				
				
			}
			
			if(no==0) {
				System.out.println("NO");
			}
			
			
		}
		
	}
	
}
