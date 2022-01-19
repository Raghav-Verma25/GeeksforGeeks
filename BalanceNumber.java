// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String N = sc.next ();

            if (new Sol().balancedNumber (N))
    		    System.out.println (1);
    		else
    		    System.out.println (0);
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Sol
{
    Boolean balancedNumber(String N)
    {
        // your code here       
        int l=0 , r=0;
        int len = N.length();
       int middle= Integer.parseInt(String.valueOf(N.charAt(len/2)));
        for(int i=0 ; i<len/2 ; i++){ 
            l=l+Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        for(int i=(len/2)+1 ; i<len ; i++){ 
            r=r+ Integer.parseInt(String.valueOf(N.charAt(i)));
        }
        if(l==r ){ 
            return true;
        }
        else{ 
            return false;
        }
    }
}
