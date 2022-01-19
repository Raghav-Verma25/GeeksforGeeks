// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String string1 = read.readLine();
            String string2 = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.removeChars(string1,string2) );
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String removeChars(String string1, String string2){
        // code here
        String s3="";
            for(int j =0 ; j<string1.length();j++){ 
               // char ch = String1.charAt(i);
               if(!string2.contains(Character.toString(string1.charAt(j)))){
                    s3=s3+string1.charAt(j);
            }
        }
        return s3;
    }
}
