// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] S = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.minimum_difference(nums);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends

class Solution
{
    public int minimum_difference(int[] nums)
    {
        // code here
        int min = Integer.MAX_VALUE;
         int diff ;
         Arrays.sort(nums);
        for( int i =0 ; i<nums.length-1 ; i++){ 
           
             min = Math.min(nums[i+1] - nums[i],min);
        }
        return min;
    }
}
