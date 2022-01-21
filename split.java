// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String s_replace = S.replace('.',' ');
        String str[]=s_replace.split("\\s");
        String s3="";
        for(int i=str.length-1 ; i>0 ; i--){ 
            s3=s3+str[i]+".";
        }
 
        return s3+str[0];
    }
}
