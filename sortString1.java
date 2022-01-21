/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0){
		String a = sc.next();
		char ch1[] = a.toCharArray();
         Arrays.sort(ch1);
         String s2 = new String(ch1);
         System.out.println(s2);
         t=t-1;
		}
	}
}
