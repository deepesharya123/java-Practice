import java.util.Scanner;

public class USBFlashDrives {

	void merge(int[] a ,int l,int m,int u) {
		int n1 = m-l+1;
		int n2 = u-m;
		
		int i,j;
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(i=0;i<n1;i++)
			left[i]=a[i+l];
		for(i=0;i<n2;i++)
			right[i]=a[i+m+1];
		
		i=0;
		j=0;
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
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] ar =  new int[n];
		int i;
		for(i=0;i<n;i++) {
			ar[i]=in.nextInt();
		}
		
		USBFlashDrives ob  = new USBFlashDrives();
		
		ob.sort(ar,0,n-1);
		int k=0;
		i=0;
		while(m>0&&i>-1) {
			m=m-ar[n-1-i];
			k++;
			i++;
		}
		System.out.println(k);
		
	}
	
}
