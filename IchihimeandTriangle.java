import java.util.Scanner;

public class IchihimeandTriangle{

     public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] ar = new int[3*t];
        int i;
        int k=0;
        for(i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            
            int l = b;
            int n = c;
            
            if(l<a) l=b;
            if(n>d)	n=c;
            
            int m =n-l+1; 
//            System.out.println(m);
            if(m<b) m=b;
            if(m>c) m=c;
            
           	ar[k] = b;
            k++;
            ar[k] = c;
            k++;
            ar[k] = c;
            k++;
            
        }
        
        for(i=0;i<3*t;i=i+3){
            System.out.println(ar[i]+" "+ar[i+1]+" "+ar[i+2]);
        }
        
        
     }
}