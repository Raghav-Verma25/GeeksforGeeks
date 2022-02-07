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

            new Solution().zigZag(arr, n);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

/*
{4, 3, 7, 8, 6, 2, 1}
Output: 3 7 4 8 2 6 1*/

class Solution {
    void zigZag(int arr[], int n) {
        // code here
        for(int i =0 ; i< n-1 ;i=i+1){ 
            if(arr[i]>arr[i+1] && i%2==0){ 
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
                
            }
            if(arr[i]<arr[i+1] && i%2==1){ 
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]=temp;
                
            }
            
        }
     //   return arr;
    }

}
