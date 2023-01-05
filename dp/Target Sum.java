//{ Driver Code Starts
//Initial Template for JAVA

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            
            String S[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            
            for(int i=0 ; i<N ; i++){
                A[i] = Integer.parseInt(S[i]);
            }
            int target = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findTargetSumWays(A,N, target));
        }
    }
}
// } Driver Code Ends

class Solution {
    static int findTargetSumWays(int[] A , int N, int target) {
        // code here
        int total = 0 ;
        for(int i =0 ; i<N ; i++){
             total = total + A[i];
        }
        if((target+total)%2==1 || total < target){
            return 0;
        }
        int sum = (total + target ) / 2;
        
        
        // now same as perfect sum problem
        int dp[][] = new int[N+1][sum+1];
        for(int i =0 ; i<= N ; i++){
            for(int j =0 ; j<=sum ; j++){
             if(i==0 && j ==0){
                 dp[i][j] =1;
             }   
             else if(i==0){
                 dp[i][j] = 0;
             }
             else if(j>= A[i-1]){
                 dp[i][j] = dp[i-1][j] + dp[i-1][j-A[i-1]];
             }
             else{
                 dp[i][j] = dp[i-1][j];
             }
             
            }
        }
        return dp[N][sum];
    }
};
