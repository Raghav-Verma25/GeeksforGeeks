// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
		    String s=sc.nextLine();
		    
		    System.out.println(printNumber(s,s.length()));
		}
		
	}

 // } Driver Code Ends
//User function Template for Java


//Function to find matching decimal representation of a string as on the keypad.
public static String printNumber(String s, int n) 
{
    //Your code here
   // char ch = s.toCharArray();
   char ch []= s.toCharArray();
         char arr[]= new char[s.length()];
         for(int i =0 ; i<s.length() ; i++){
             if(s.charAt(i)>='a' && ch[i]<='c'){
                 arr[i]='2';
             }
             if(ch[i]>='d' && ch[i]<='f'){
                 arr[i]='3';
             }
            if(s.charAt(i)>='g' && s.charAt(i)<='i'){
                 arr[i]='4';
             }
             if(s.charAt(i)>='j' && s.charAt(i)<='l'){
                 arr[i]='5';
             }
             if(s.charAt(i)>='m' && s.charAt(i)<='o'){
                 arr[i]='6';
             }
             if(s.charAt(i)>='p' && s.charAt(i)<='s'){
                 arr[i]='7';
             }
             if(s.charAt(i)>='t' && s.charAt(i)<='v'){
                 arr[i]='8';
             }
             if(s.charAt(i)>='w' && s.charAt(i)<='z'){
                 arr[i]='9';
             }

         }
        
        return String.valueOf(arr);

    
}


// { Driver Code Starts.

}
  // } Driver Code Ends
