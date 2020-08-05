import java.util.Scanner;

public class GiftsFixing{
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		long[] res= new long[t];
		for(i=0;i<t;i++) {
			int n =in.nextInt();
			
			int[] a= new int[n];
			int[] b= new int[n];
			
			int j;
			for(j=0;j<n;j++)
				a[j]=in.nextInt();
			for(j=0;j<n;j++)
				b[j]=in.nextInt();
			
			int ma =a[0],mb=b[0];
			for(j=0;j<n;j++) {
				if(ma>a[j]) ma = a[j];
			}
			for(j=0;j<n;j++) {
				if(mb>b[j]) mb = b[j];
			}
			long drop=0;
			for(j=0;j<n;j++) {
				int x = a[j];
				int y = b[j];
				
				if(x==ma&&y!=mb) {
					drop = drop+y-mb;
				}else if(y==mb&&x!=ma) {
					drop= drop+x-ma;
				}
				else {
					int da =x-ma;
					int db =y-mb;
					
					int l=da;
					if(l<db) l=db;
					
					drop=drop+l;
				}
				
			}
			
			
			res[i]=drop;
			
		}
		
		for(i=0;i<t;i++) {
			System.out.println(res[i]);
		}
		
	}
}
