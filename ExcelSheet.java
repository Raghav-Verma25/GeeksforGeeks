// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int N){
        
        //  Your code here
        char ch ;
        String str = "";
        while(N>0){
            N--;
            int mod = N%26;
            ch = (char)(65+ mod) ;
            str = ch + str;
            N=N/26;
        }
        
        return str;
    }
}
