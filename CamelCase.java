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
            String s = sc.next ();
    		System.out.println (new Sol().countCamelCase (s));
        }
        
    }
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countCamelCase (String s)
    {
        // your code here 
         int c=0;
         for (int i = 0; i < s.length() ; i++) {
             if(s.charAt(i)>='A'&& s.charAt(i)<='Z'){
                 c=c+1;
             }
         }
         return c;
    }
}
