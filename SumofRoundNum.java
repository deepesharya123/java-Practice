import java.util.Scanner;
import java.util.Vector;

public class SumofRoundNum {

	public static void main(String args[]) {
	Scanner in = new Scanner(System.in);
	
	int t = in.nextInt();
	Vector dc = new Vector();
	Vector cdc = new Vector();
	int i;
	int[] q = new int[t];
	int sum=0;
	Vector o = new Vector();
	Vector nonz = new Vector();
	for(i=0;i<t;i++) {
		int n = in.nextInt();
		Vector v = new Vector();
		q[i]=n;
		int cn = n;
		int count=0;
		int non = 0;
		while(cn!=0) {
			count++;
			int ad =cn%10; 
			cn=cn/10;
			if(ad!=0) non++;
			v.add(ad);	
		}
		nonz.add(non);
		int j;
		for(j=v.size()-1;j>-1;j--) {

			 int z = (int) v.get(j);
			o.add(z);
			
		}
		dc.add(count);
		cdc.add(count);
		
		sum=sum+count;
	}

//	System.out.println(o);
////
//	System.out.println(nonz);
	int l=0;
	for(i=0;i<dc.size();i++) {
			int num = (int) dc.get(i);
			while(num!=0) {
				double cn = num-1;
				dc.set(i,num-1);
				double ten = 10;
				double pows = Math.pow(ten,cn);
				int power = (int) pows;
				int nn = (int) o.get(l);
				nn=nn*power;
				o.set(l, nn);				
				l++;
				num--;
				
//			continue;
		}
	}
	
//	System.out.println(o);
	dc=cdc;
	int y=0;
	int comp =dc.size();
	int[] res = new int[o.size()];
	for(i=0;i<dc.size();i++) {
		
		int num = (int) dc.get(i);

		int mun = (int) nonz.get(i);
		System.out.println(nonz.get(i));
		
		
		
		
		while(num!=0) {
			int nu=(int) o.get(y);
			y++;
			num--;
			if(nu!=0)
				System.out.print(nu+" ");
		}
		System.out.println();
	
	}
	
	
	
	
	
	}

}
