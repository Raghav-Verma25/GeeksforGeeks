// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = new String[2];
            S = read.readLine().split(" ");
            long i = Integer.parseInt(S[0]);
            long L = Integer.parseInt(S[1]);
            Solution ob = new Solution();

            System.out.println(ob.leftShops(i, L));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution {
    static long leftShops(long i, long L){
        // code here
        long a = (long)Math.pow(2,L);
        long b = a-i;
        return b;
    }
}
