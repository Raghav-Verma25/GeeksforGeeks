//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Node
{
    int data; 
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node root = null;
            int inorder[] = new int[n];
            int preorder[] = new int[n];
            for(int i = 0; i < n; i++)
              inorder[i] = sc.nextInt();
              
            for(int i = 0; i < n; i++)
              preorder[i] = sc.nextInt();
              
            Solution ob = new Solution();
            root = ob.buildTree(inorder, preorder, n);
            postOrdrer(root);
            System.out.println();
        }
    }
    
    public static void postOrdrer(Node root)
    {
        if(root == null)
          return;
          
        postOrdrer(root.left);
        postOrdrer(root.right);
        System.out.print(root.data + " ");
    }
}
// } Driver Code Ends


class Solution
{
    static int index=0;
    static HashMap<Integer,Integer> map = new HashMap<>();
    
    public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        index=0;
        for(int i =0 ; i< n ; i++){
            map.put(inorder[i] , i); 
        }
        Node root = solve(inorder , preorder , 0, n-1);
        return root;
    }
    static Node solve(int inorder[], int preorder[], int lb, int ub){
        if(lb > ub){
            return null;
        }
        int element = preorder[index++];
        Node res = new Node(element);
        if(lb==ub){
            return res;
        }
        int mid = map.get(element);
        res.left = solve(inorder , preorder , lb , mid-1);
        res.right = solve(inorder , preorder , mid+1 , ub);
        return res;
        
    }
}
