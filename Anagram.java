// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String str = br.readLine();
		    String s1 = str.split(" ")[0];
		    String s2 = str.split(" ")[1];
		    
		    Solution obj = new Solution();
		    
		    if(obj.isAnagram(s1,s2))
		    {
		        System.out.println("YES");
		    }
		    else
		    {
		         System.out.println("NO");
		    }
		    
		    
		    
		}
	}
}// } Driver Code Ends


class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        if(a.length()!=b.length()){ 
            return false;
        }
        
        char ch1[] = a.toCharArray();
        char ch2[] = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        int c=0;
        for(int i =0 ; i<a.length() ; i++){ 
                if(ch1[i]==ch2[i]){
            c=c+1;
        }
    }
        if(c==a.length()){ 
            return true;
        }
        
       return false;
    }
}
