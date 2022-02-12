/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test!=0){
		int size = sc.nextInt();
		int s = sc.nextInt();
		int c=0;
		int arr[]  = new int[size];
		for(int i =0 ; i< size ; i++){ 
		    arr[i] = sc.nextInt();
		    if(arr[i]>s){ 
		        c=c+1;
		    }
		}
		System.out.println(c);
		test--;
		}
	}
}
