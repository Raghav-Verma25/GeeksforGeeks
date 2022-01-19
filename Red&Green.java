// { Driver Code Starts
// initial template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Position this line where user code will be pasted.
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.RedOrGreen(N, S));
        }
    }
}// } Driver Code Ends


//User function template for Java

class Solution {
    static int RedOrGreen(int N, String S) {
        //code here
        int r=0 , g=0;
        for(int i=0 ; i<N ; i++){ 
            int asscii = (int)S.charAt(i);
            if(asscii == 82){ 
                r=r+1;
            }
            else{ 
                g=g+1;
            }
        }
        int min = Math.min(r,g);
        return min;
    }
}
