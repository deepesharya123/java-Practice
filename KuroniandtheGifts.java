import java.util.Scanner;

public class KuroniandtheGifts {

	void merge(int[] a,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int j;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(j=0;j<n1;j++)
			left[j]=a[j+l];
	
		j=0;
		for(j=0;j<n2;j++) {
			right[j]=a[j+m+1];
		}
		
		int i=0;
		j=0;
		// left i
//		 right j
		int k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}else {
				a[k]=right[j];
				j++;
			}
			
			k++;
		}
		
		while(i<n1) {
			a[k]=left[i];
			i++;k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;k++;
		}
		
		
		
	}
	
	void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = l+u;
			m=m/2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		int i;
		for(i=0;i<t;i++) {
			int n =in.nextInt();
			
			int[] a = new int[n];
			int[] b = new int[n];
			
			int j;
			for(j=0;j<n;j++)
				a[j]=in.nextInt();

			for(j=0;j<n;j++)
				b[j]=in.nextInt();
			
			KuroniandtheGifts ob = new KuroniandtheGifts();
			ob.sort(a,0,n-1);
			ob.sort(b,0,n-1);
			

			for(j=0;j<n;j++)
				System.out.print(a[j]+" ");
System.out.println();
			for(j=0;j<n;j++)
				System.out.print(b[j]+" ");
				
System.out.println();
		}
		
		
		
	}
	
}
