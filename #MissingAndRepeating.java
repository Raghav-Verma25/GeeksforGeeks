// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
       int org_sum=0 , curr_sum=0 , ind,element;
       int arr2[] = new int[2];
       for(int i =0 ; i<n  ; i++){ 
           element = Math.abs(arr[i]);
           ind = element-1;
           if(arr[ind]<0){ 
               arr2[0] = element;
           }
           arr[ind] = -arr[ind];
           org_sum = org_sum + (i+1);
           curr_sum = curr_sum+ element ;
               
       }
       arr2[1] = org_sum - (curr_sum - arr2[0]);
       return arr2;
    }
}
