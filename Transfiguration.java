// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
    	// Your code goes here.
    	int len1 = A.length();
    	int len2 = B.length();
    	int sum1 = 0 , sum2 =0 , c=0;
    	for(int i =0 ; i<len1 ; i++){ 
    	    int asscii = A.charAt(i);
    	    sum1 = sum1 + asscii;
    	}
    	for(int i =0 ; i<len1 ; i++){ 
    	    int asscii = B.charAt(i);
    	    sum2 = sum2 + asscii;
    	}
    	if(sum1!=sum2){ 
    	    return -1;
    	}
    	 if(sum1==sum2){ 
 
    	    
    	    while(len1 >0 && len2>0){
    	        if(A.charAt(len1-1)==B.charAt(len2-1)){ 
    	            len1--;
    	            len2--;
    	        }
    	        else{ 
    	            len1--;
    	            c=c+1;
    	        }
    	    }
    	    
    	    return c;
    	    
    	}
    	return -1;
    }
}








