// { Driver Code Starts
import java.util.*;
class Numbers{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i = 0; i < n; i++)
		{
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		GfG g=new GfG();
		System.out.println(g.num(a,n,k));
	}
}
}// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
          public static int num(int a[], int n, int k)
            { int c=0;
                 //Your code here
                 for(int i =0 ; i<n ; i++){ 
                     int temp;
                    
                     while(a[i]!=0){ 
                         temp = a[i]%10;
                         if(temp==k){ 
                             c=c+1;
                         }
                         a[i] = a[i]/10;
                     }
                 }
        return c;
            }
}
