//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int A[] = new int[n];
                    for(int i = 0;i<n;i++)
                        A[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDifference(A,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{

	public int minDifference(int arr[], int n) 
	{ 
	    // Your code goes here4
	    int sum = 0;
	    for(int i =0 ; i<n ; i++){
	         sum = sum + arr[i];    
	    }
	    int dp[][] = new int[n+1][sum+1 ];
	    for(int i =0 ; i<dp.length ; i++){
	        for(int j =0; j<=sum ; j++){
	           if(i==0 && j==0){
	                dp[i][j] = 1;
	            }
	          else if(i==0){
	                dp[i][j] = 0;
	            }
	            else if(j==0){
	                dp[i][j] = 1;
	            }
	          
	            else{
	                  if(dp[i-1][j] == 1){
                        dp[i][j] = 1;
                    }
	                int val = arr[i-1];
	                if(val <= j ){
	                    if(dp[i-1][j-val] ==  1){
	                        dp[i][j] = 1;
	                    }
	                }
	            }
	        }
	    }
	    int diff = Integer.MAX_VALUE;
	    for(int i =0 ; i<=sum/2 ; ++i){
	        int first = i;
	        int second = sum - i;
	        if(dp[n][i] == 1 && diff > Math.abs(first-second)){
	            diff = Math.abs(first - second);
	        }
	    }
	    return diff;
	} 
}
