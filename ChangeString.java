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
            Solution ob = new Solution();
            String ans = ob.modify(s);
            System.out.println(ans);
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    String modify(String s){
        int len = s.length();
        String s2 = "";
        int asscii = (int)s.charAt(0);
        if(asscii>= 65 && asscii <=90){ 
            s2=s.toUpperCase();
        }
        else{ 
            s2=s.toLowerCase();
        }
        return s2;
    }
}
