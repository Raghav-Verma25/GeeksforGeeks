// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String S) {
        // code here
        int len = S.length();
        int c=0;
        for(int i=0 ; i<len/2 ; i++){ 
            if(S.charAt(i)==S.charAt(len-i-1)){ 
                c=c+1;
             //   len = len-1;
            }
            
        }
        if(c==S.length()/2){ 
            return 1;
        }
        else
        return 0;
        
    }
};
