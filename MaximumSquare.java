import java.util.Scanner;

public class MaximumSquare {
	
	void merge(int a[],int l,int m,int u) {
		
		int n1 = m-l+1;
		int n2 = u-m;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		int i;
		for(i=0;i<n1;i++)
			left[i]= a[l+i];
		
		i=0;
		for(i=0;i<n2;i++)
			right[i]=a[m+1+i];
		
		i=0;
		int j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(left[i]<right[j]) {
				a[k]=left[i];
				i++;
			}
			else {
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

	void sort(int a[], int l,int u) {
		int m = l+u;
		m = m/2;
		
		if(l<u) {
			sort(a,l,m);
			sort(a,m+1,u);
			
			merge(a,l,m,u);
		}
		
		
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		
		MaximumSquare ob = new MaximumSquare();

		int[] res= new int[t];
		
		int i=0;
		int k =0;
		
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] a = new int[n];
			
			
			int j ;
			for(j=0;j<n;j++)
				a[j]=in.nextInt();
			
			
			int r=0;
			for(r=1;r<n+1;r++) {
				int ans = 0;
				for(j=0;j<n;j++) {
					int nu = a[j];
					if(nu>=r) {
						ans++;
					}
				}
//				System.out.println(r+" "+ans);
				if(ans>=r) {
					res[i]=r;
				}
				
			}
			
		}
		
		for(i=0;i<t;i++)
			System.out.println(res[i]);
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
