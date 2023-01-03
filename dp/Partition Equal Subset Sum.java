//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
         int sum =0 ; 
        for(int i =0 ; i<arr.length ; i++){
            sum = sum + arr[i];
        }
        if(sum%2==1){
            return 0;
        }
        return isSubset(arr , sum/2);
    }
    public static int isSubset(int a[], int sum){
        // code here
        int dp[][] = new int[a.length+1][sum+1];
        for(int i =0 ; i<dp.length ; i++){
            for(int j =0 ; j<dp[0].length ; j++){
                if(i==0 && j==0){
                    dp[i][j] = 1;
                }
               else if(j==0){
                    dp[i][j] = 1;
                }
                else if(i==0){
                    dp[i][j] = 0;
                }
                else{
                    if(dp[i-1][j] == 1){
                        dp[i][j] = 1;
                    }
                    int val = a[i-1];
                    if(val <= j ){
                        if(dp[i-1][j-val] == 1){
                            dp[i][j] = 1;
                        }
                    }
                }
            }
        }
        return dp[a.length][sum];
}
}
