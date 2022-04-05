// { Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
import java.lang.*;

class GFG{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test-- > 0) {
			int B = Integer.parseInt(br.readLine());
			Solution obj = new Solution();
			int count = obj.countSquare(B);
			System.out.println(count);
		}
	}
}// } Driver Code Ends


//User function Template for Java

class Solution{
	int countSquare(int B){
		//Write your code here
		if(B==0 || B==1 || B==2 || B==3){
		    return 0;
		}
		int base = B/2;
		int height = B/2;
		int height2 = height-1;
		int res = base * height2/2;
		return res;
	}
}
