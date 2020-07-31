import java.util.*;
public class commonsubsequence {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		// TODO Auto-generated constructor stub
	
		int t = in.nextInt();
		int i;
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int m = in.nextInt();
			Vector  a = new Vector();
			Vector  b = new Vector();
			int j ;
			for(j=0;j<n;j++) {
				int num = in.nextInt();
				a.add(num);
			}
			for(j=0;j<m;j++) {
				int num = in.nextInt();
				b.add(num);
			}
			int no=0;
			
			for(j=0;j<n;j++) {
				int num = (int) a.get(j);
				
				if(b.contains(num)) {
					System.out.println("YES");
					System.out.println(1+ " "+num);
					no=1;
					break;

				}
			}
			
			if(no==0) {
				System.out.println("NO");
			}
			
			
			
		}
	}

}
