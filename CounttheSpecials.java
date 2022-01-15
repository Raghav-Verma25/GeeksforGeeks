
import java.io.*;
import java.util.*;
import java.lang.*;



class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        int result=0;
        for(int i =0 ; i<n ; i++){ 
            int count =0;
            for(int j =0 ; j<n ; j++){ 
                if(a[i]==a[j]){ 
                    count ++;
                }
            }
        if(count==f){
            result = result+1;
            a[i]=-1;
        }
            
        }
        
        System.out.println(result);
        
    }
}

// { Driver Code Starts.

// Driver class
class GFG {
	public static void main (String[] args) {
	    
	    // Taking input through Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking count of testcases
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    
		    //taking size of array
		    int sizeof_array = sc.nextInt();
		    
		    //taking value of k
		    int k = sc.nextInt();
		    
		    //creating an array
		    int a[] = new int[sizeof_array];
		    
		    //inserting elements to the array
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    //creating an object of class Geeks
		    Geeks obj = new Geeks();
		    
		    //calling countSpecials method of 
		    //class Geeks
		    obj.countSpecials(a, sizeof_array, k);
		}
		
	}
}  // } Driver Code Ends
