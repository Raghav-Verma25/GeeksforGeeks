// { Driver Code Starts
import java.util.*;


class Implement_strstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String line = sc.nextLine();
			String a = line.split(" ")[0];
			String b = line.split(" ")[1];
			
			GfG g = new GfG();
			System.out.println(g.strstr(a,b));
			
			t--;
		}
	}
}// } Driver Code Ends


class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
       int len1=s.length();
       int len2=x.length();
       if(len2==0 ){ 
           return -1;
       }
       
       if(len1>=len2){
       for(int i=0 ; i<=len1-len2 ; i++){ 
           String s2 = s.substring(i,i+len2);
           if(x.equals(s2)){ 
              
              return i;
           
           }
       }   
       }
     return -1;  
    }
}
