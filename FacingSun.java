// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] h = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(inputLine[i]);
            }


            int ans = new Solution().countBuildings(h, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java



class Solution {
    int countBuildings(int h[], int n) {
        // code here
        int max=h[0];
        int c=1;
        for(int i =1 ; i< n ; i++){ 
            if(max<h[i]){ 
                c=c+1;
                max = h[i];
            }
        }
        return c;
        
    }
}
