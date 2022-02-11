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
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxSum(arr, n);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxSum(int arr[], int n) {
        // code here
         if(n==0){ 
            return 0;
        }
        if(n==1){ 
            return arr[0];
        }
        int arr2[] = new int[n+1];
        arr2[1] = arr[0];
        arr2[2] = Math.max(arr[0] , arr[1]);
       
        
        for(int i =3 ; i<=n ; i++){ 
            arr2[i] = Math.max(arr2[i-1] , arr2[i-2]+arr[i-1] );
            
        }
        return arr2[n];
        
        
    }
}
