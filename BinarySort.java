// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int arr2[] = new int[n];
	    int j=0 ,k=n-1;
	    for(int i=0 ; i<n ; i++){ 
	            if(arr[i]==0){ 
	                arr2[j]=arr[i];
	                j=j+1;
	            }
	            else{ 
	                arr2[k]=arr[i];
	                k=k-1;
	            }
	        
	    }
	    return arr2;
	    
	} 
} 
