// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.arrangeString(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String arrangeString(String s)
        {
            //code here.
            char ch[]= s.toCharArray();
           
            Arrays.sort(ch);
            int len =s.length();
            int c=0;
            int total=0;
            for(int i =0 ; i <len ;i++){ 
                int asscii = (int)ch[i];
                if(asscii>=48 && asscii<=57){ 
                    c=c+1;
                    total=total + (asscii - 48);
                }
            }
            char alpha[] = new char[len-c];
            int k=0;
            for(int j =0 ; j<len ; j++){ 
                if(!(ch[j]>='0' && ch[j]<='9')){
                    alpha[k]=ch[j];
                    k=k+1;
                }
            }
            String s_num = ""+total;
           String s_alpha2= new String(alpha);
           
            String s_result = "";
            s_result = s_alpha2+s_num;
            return s_result;
            
  
               
        }
}
