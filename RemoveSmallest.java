import java.util.Scanner;

public class RemoveSmallest{

	void merge(int ar[],int l,int m, int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		int i;
		for(i=0;i<n1;i++)
			left[i]=ar[l+i];
		i=0;
		for(i=0;i<n2;i++)
			right[i]=ar[m+1+i];
		
		
		int j=0;
		int k=l;
		int h=0;
		while(j<n1&&h<n2) {
			if(left[j]<right[h]) {
				ar[k]=left[j];
				j++;
			}else {
				ar[k]=right[h];
				h++;
			}
			k++;
		}
		
		while(j<n1) {
			ar[k]=left[j];
			k++;j++;
		}
		while(h<n2) {
			ar[k]=right[h];
			k++;h++;
		}
		
		
	}
	
	void sort(int ar[],int l, int u) {
		if(l<u) {
			int mid = l+u;
			mid = mid/2;
			
			sort(ar,l,mid);
			sort(ar,mid+1,u);
			
			merge(ar,l,mid,u);
			
		}
	}
	
	public static void main(String args[]) {
		Scanner in =  new Scanner(System.in);
		
		int t= in.nextInt();
		int i;
		int[] res= new int[t];
		for(i=0;i<t;i++) {
			int n = in.nextInt();
			int[] ar = new int[n];
			int j;
			for(j=0;j<n;j++)
				ar[j]=in.nextInt();
			
			DIv661 ob =new DIv661();
			int l = 0;
			int u = n-1;
			ob.sort(ar, l, u);
			
			int check=0;
			for(j=0;j<n-1;j++) {
				if(ar[j+1]-ar[j]>=2) {
					check=1;
					break;
				}
			}
//			System.out.println(check);
			if(check>0) {
				res[i]=1;  // no
			}
			

			
		}
//		System.out.println("ASDFcffc");
		for(i=0;i<t;++i) {
//			System.out.println(res[i]);
			if(res[i]==1) {
				System.out.println("NO");
			}
			else {
				System.out.println("YES");
			
			}
		}
		
		
		
	}
	
}
