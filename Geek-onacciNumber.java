/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner (System.in);
		int t= sc.nextInt();
		while(t!=0){ 
		    int a =sc.nextInt();
		    int b =sc.nextInt();
		    int c =sc.nextInt();
		    int n =sc.nextInt();
		    int arr[] = new int[n];
		    arr[0]=a;
		    arr[1]=b;
		    arr[2]=c;
		  for(int i =3 ; i<n ; i++){ 
		        arr[i] = arr[i-3] + arr[i-2] + arr[i-1];
            		        
		    
		  		    }
		    	System.out.println(arr[n-1]);
		    	t=t-1;
		}
	
	}
}
