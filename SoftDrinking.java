import java.util.Scanner;

public class SoftDrinking {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int k = in.nextInt();
	int l = in.nextInt();
	int c = in.nextInt();
	int d = in.nextInt();
	int p = in.nextInt();
	int nl = in.nextInt();
	int np = in.nextInt();
	int s=10000;
	
	int totv = k*l;
	int m1 = totv/nl;
	int m2 = c*d;
	int m3 = p/np;
	
	if(m1<s) s=m1;
	if(m2<s) s=m2;
	if(m3<s) s=m3;
	
	System.out.println(s/n);
	
	
	
	}

}
