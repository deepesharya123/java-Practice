import java.util.Scanner;

public class TernarySequence {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int t = in.nextInt();
		
		int i;
		int[] res= new int[t];
		
		for(i=0;i<t;i++) {
			int a=in.nextInt();
			int b=in.nextInt();
			int c=in.nextInt();
			int x=in.nextInt();
			int y=in.nextInt();
			int z=in.nextInt();
		
			int sum1= 0,sum2=0;
			
			if(y>=c) {
				sum1=c*2+sum1;
				y=y-c;
				c=0;
			}else {
				sum1=sum1+y*2;
				c=c-y;
				y=0;
			}
			z=z-c;
			
			
			
			int n = a+b+c;
			
//			int[] ar = new int[n];
//			int[] br = new int[n];
			
			int j;
			int ca=a,cb=b,cc=c,cx=x,cy=y,cz=z;
//			for(j=0;j<n;j++) {
//				if(ca>0) {
//					ar[j]=0;
//					ca--;
//				}else {
//					if(cb>0) {
//						ar[j]=1;
//						cb--;
//					}else {
//						ar[j]=2;
//						cc--;
//					}
//				}
//			}
			
				ca=cx;
				cb=cy;
				cc=cz;
//				System.out.println(z);
				if(z!=0) {
					int a0b2 = Math.min(z, a);
					z=z-a0b2;
					a=a-a0b2;
					if(z!=0) {
//						System.out.println(z);
						int a1b2= Math.min(z, b);
						b=b-a1b2;
						z=z-a1b2;
						a1b2=a1b2*2;
//						System.out.println(a1b2);
						a1b2=-a1b2;
						sum1=sum1+a1b2;
					}
				}
				
//			for(j=0;j<n;j++) {
//				if(ca>0) {
//					br[j]=0;
//					ca--;
//				}else {
//					if(cb>0) {
//						br[j]=1;
//						cb--;
//					}else {
//						br[j]=2;
//						cc--;
//					}
//				}
//			}
//			System.out.println(sum2);
//			System.out.println(a+b+c);
//			System.out.println(x+y+z);
			int storsum=sum1;
			sum1=0;
			
			
			
//			int h=n-1;
//			for(j=0;j<n;j++) {
//				if(ar[j]==br[h-j]) {
//					sum2=sum2;
//				}else if(ar[j]>br[h-j]) {
//					sum2=sum2+(ar[j]*br[h-j]);
//				}else {
//					sum2=sum2-(ar[j]*br[h-j]);
//				}
//			}
			
//			System.out.println(sum1+" "+sum2+" is the sum"+storsum);
			
//			int nz=a+x;
//			int non = b+y+c+z;
//			if(nz<non) {
//				int min20 =Math.min(z, a);
//				a=a-min20;
//				z=z-min20;
//				int add=0;
//				if(z>0) {
//					add = z*-2;
//				}
//				sum1=sum1+add;
//				
//				
//			}
//			System.out.println(a+" "+b+" "+c);
//			System.out.println(x+" "+y+" "+z);
//			res[i]=Math.max(sum1, sum2);
			res[i]=storsum;
			
		}
		
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
	}
	
}
