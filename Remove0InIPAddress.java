// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends

class Solution
{
    public String newIPAdd(String S)
    {
        // your code here
         String str[] = S.split("[.]", 0);
         String ans="";
         int k;
         for(String x:str){ 
             k=0;
             while(x.charAt(k)=='0'){ 
                 if(k==x.length()-1){ 
                    break;
                 }
                 k++;
             }
             ans = ans + x.substring(k)+".";
         }
         return ans.substring(0,ans.length()-1);
    }
}
