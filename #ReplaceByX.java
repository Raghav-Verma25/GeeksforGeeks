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
		    String str = sc.next();
		    String substr= sc.next();
            while(str.contains(substr+substr)){ 
                str = str.replace(substr+substr,substr);
            }
            str=str.replaceAll(substr,"X");
            System.out.println(str);
		    
		    
		    test--;
		}
	}
}
