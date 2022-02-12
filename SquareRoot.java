// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long low =1 , high =x;
		long ans =-1 ;
		long mid;
		long sq;
		
		    while(low<=high){ 
		        mid = (low+high)/2;
		        sq=mid*mid;
		        if(sq==x){ 
		            return mid;
		        }
		        else if(sq>x){ 
		            high = mid-1;
		        }
		        else { 
		            low= mid+1;
		            ans=mid;
		        }
		        
		    }
		
		
		
		return ans;
		
		
		
		
		
	 }
}
