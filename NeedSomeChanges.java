
import java.io.*;
import java.util.*;


class Geeks{
    static void swapElements(int a[], int n){
        
        // Your code here
       // int l = (n/2)+1;
        for(int i =0 ; i<n-2 ; i++){ 
            for(int j=i+2 ; j< a.length  ; j++){ 
                int temp = a[i];
                a[i]=a[j];
                a[j]=temp;
                break;
            }
            
        }
       // System.out.println(a);
    for(int j :a){ 
        System.out.print(j+" ");
    }
       
       System.out.println();
        
    }
}

// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int sizeof_array = sc.nextInt();
		    int a[] = new int[sizeof_array];
		    
		    for(int i = 0;i<sizeof_array;i++){
		        a[i] = sc.nextInt();
		    }
		    
		    Geeks obj = new Geeks();
		    obj.swapElements(a, sizeof_array);
		}
		
	}
}  // } Driver Code Ends
