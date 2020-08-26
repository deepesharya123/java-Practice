import java.util.Scanner;

public class Squares {
	
	void merge(int[] a,int l,int m,int u) {
		
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left=new int[n1];
		int[] right=new int[n2];
		
		int i;
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[i+m+1];
		
		int j=0;
		i=0;
		int k = l;
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
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=right[j];
			j++;
			k++;
		}
		
		
		
		
		
		
	}

	void sort(int[] a,int l,int u) {
		if(l<u) {
			int m = l+u;
			m/=2;
			
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
	}
	
	public static void main(String arg[]) {
		Scanner in = new Scanner(System.in);
		
		int n  = in.nextInt();
		int k = in.nextInt();
		
		int[] ar = new int[n];
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		
		Squares ob = new Squares();
		ob.sort(ar, 0, n-1);
		
		if(k>n) {
			System.out.println("-1");
		}else {
			int dif= n-k;
			int ri=dif-1;
			if(ri>=0) {
			int num = ar[ri];
			num++;
			System.out.println(num+" "+num);
			}
			else
				System.out.println(ar[0]+" "+ar[0]);
		}
		
	}
	
	
}
