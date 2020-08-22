import java.util.Scanner;

public class ArrayStabilization {

	void merge(int[] a,int l,int m,int u) {
		int n1=m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		
		int j;
		for(j=0;j<n1;j++) {
			left[j]=a[j+l];
		}
		for(j=0;j<n2;j++) {
			right[j]=a[j+m+1];
		}
		
		int i=0,k=l;
		j=0;
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
	
	
	void sort(int[] a , int l, int u) {
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
		
		int n= in.nextInt();
		int[] a = new int[n];
		int i;
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		ArrayStabilization ob = new ArrayStabilization();
		ob.sort(a,0,n-1);
			
		
	
		
		
		int s1= a[n-1]-a[1];
		int s2=a[n-2]-a[0];
//		System.out.println(s1);
//		System.out.println(s2);
		int res=Math.min(s1, s2);
		
		System.out.println(res);
		
		
		
		
		
		
	}
	
}
