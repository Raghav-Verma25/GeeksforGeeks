// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String A, String B) {
        // code here.
        int len1 = A.length();
        int len2 = B.length();
        int  n;
        String S = A;
         for(int i =1 ; ; i++){ 
             if(S.contains(B)){ 
                 return i;
             }
             if(S.length()> B.length() ){
                break;
             }
             S=S+A;
         }
          return -1;
    }
}
