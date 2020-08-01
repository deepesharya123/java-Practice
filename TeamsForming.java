import java.util.Scanner;

public class TeamsForming {
	
	void merge(int a[],int l,int mid,int u) {
		int n1 = mid-l+1;
		int n2 = u-mid;
		
		int[] le = new int[n1];
		int[] ri = new int[n2];
		
		int i,j;
		i=0;
		j=0;
		
		for(i=0;i<n1;i++) {
			le[i]=a[l+i];
		}
		i=0;
		for(i=0;i<n2;i++) {
			ri[i]=a[mid+1+i];
		}
		i=0;
		j=0;
		int k=l;
		while(i<n1&&j<n2) {
			if(le[i]<ri[j]) {
				a[k]=le[i];
				i++;
			}else {
				a[k]=ri[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			a[k]=le[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			a[k]=ri[j];
			j++;
			k++;
		}

		
		
	}
	
	
	void sort(int a[],int l,int u) {
		
		if(l<u) {
			int mid = l+u;
			mid=mid/2;
			
			sort(a,l,mid);
			sort(a,mid+1,u);
			
			merge(a,l,mid,u);
			
		}
	
	}
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int i;
		int[] a = new int[n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		
		TeamsForming ob = new TeamsForming();
		ob.sort(a, 0, a.length-1);
		int s=0;
		for(i=0;i<n-1;i=i+2) {
			int x= a[i];
			int y = a[i+1];
//			System.out.println(x+" "+y);
			int d=y-x;
			s=s+d;
		}
		
		System.out.println(s);
		
	}

}
