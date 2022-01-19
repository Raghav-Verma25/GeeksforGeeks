// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    int t=Integer.parseInt(st.nextToken());
	    while(t-->0){
	        String s=br.readLine();
	        
	        Solution obj = new Solution();
	        
	        System.out.println(obj.findSum(s));
	    }
		
	}
}
// } Driver Code Ends




class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        String temp="0";
        long sum=0;
        //char ch[] = new char[s.length()];
        char ch []= str.toCharArray();
        for(int i=0 ; i<str.length() ; i++){
            if(Character.isDigit(ch[i])){
                temp = temp+ch[i];
            }
            else{
                sum=sum+ Long.parseLong(temp);
                temp="0";
            }
        }
        return sum + Long.parseLong(temp) ;
    }
    
}
