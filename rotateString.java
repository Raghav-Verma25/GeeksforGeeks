// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
       int len = str1.length();
        char ch[] = str1.toCharArray();
        ch[len-2] = str1.charAt(0);
        ch[len-1] = str1.charAt(1);
        for(int i =2 ; i< len ;i++){
            ch[i-2] = str1.charAt(i);
        }
    String s1 = new String(ch);


        char ch1[] = str1.toCharArray();
        ch1[0] = str1.charAt(len-2);
        ch1[1] = str1.charAt(len-1);
        for(int i =2 ; i< len ;i++){
            ch1[i] = str1.charAt(i-2);
        }
        
        String s2 = new String(ch1);
          
        if(s1.equals(str2) || s2.equals(str2)){ 
            return true;
        }
        else{ 
            return false;
        }

    }
    
}
