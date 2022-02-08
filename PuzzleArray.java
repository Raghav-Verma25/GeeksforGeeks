// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
              
            Geeks obj = new Geeks();
            obj.SumArray(arr, n);
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

// arr is the array
// n is the number of element in array
class Geeks
{
    public static void SumArray(int arr[], int n)
    {
        // your code here
        
        for(int i=0 ; i < n ; i++){ 
            int sum=0;
            for(int j =0 ; j< n ; j++){ 
             sum = sum + arr[j];
            }
            System.out.print(sum - arr[i]+ " ");
        }
    }
}
