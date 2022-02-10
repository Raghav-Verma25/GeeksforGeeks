// { Driver Code Starts
import java.util.*;
class Index{
public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 int T = sc.nextInt();
		while(T-- > 0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.findEquilibrium(a,n));
		}
}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
           public static int findEquilibrium(int arr[], int n)
              {
                //add code here.
                int total=0;
                int lsum =0 ;
                int rsum =0;
               for(int i =0 ; i< n  ; i++){ 
                   total = total + arr[i];
               } 
               rsum =total;
               for(int j =0 ; j< n  ; j++){ 
                   rsum = rsum - arr[j];
                   if(lsum== rsum){ 
                       return j;
                   }
                   lsum = lsum + arr[j];
               }
               return -1;
              }
}
