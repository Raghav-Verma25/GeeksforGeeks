// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SortedStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			Stack<Integer> s=new Stack<>();
			int n=sc.nextInt();
			while(n-->0)
			s.push(sc.nextInt());
			GfG g=new GfG();
			Stack<Integer> a=g.sort(s);
			while(!a.empty()){
				System.out.print(a.peek()+" ");
				a.pop();
			}
			System.out.println();
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG{
    public void sorting(Stack<Integer>stk){ 
        if(!stk.empty()){ 
            int temp = stk.pop();
            sorting(stk);
            insertAt(stk,temp);
        }
    }
    public void insertAt(Stack<Integer>stk , int temp){ 
        if(stk.empty() || stk.peek()<temp ){ 
            stk.push(temp);
        }
        else{
        int value = stk.pop();
        insertAt(stk,temp);
        stk.push(value);
        }
    }
    
	public Stack<Integer> sort(Stack<Integer> stk)
	{
		//add code here.
		sorting(stk);
		return stk;
	}
}
