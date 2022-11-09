//{ Driver Code Starts
// Initial Template for Java

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }
    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            int n = Integer.parseInt(br.readLine());
            Node root = buildTree(s);
            Tree g = new Tree();
            System.out.println(g.findCeil(root, n));
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Tree {
    List<Integer> list = new ArrayList<>();
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        // if (root == null) return -1;
        // int ans = 0;
        // while(root!=null){
        //     if(root.data == key){
        //         return key;
        //     }
        //     else if(root.data < key){
        //         root = root.right ;
        //     }
        //     else if(root.data > key){
        //         ans = root.data;
        //       root =  root.left;
                
        //     }
        // }
        // return ans;
        
        helper(root);
        int max = 0;
        if(list.contains(key)){
            return key;
        }
        else{
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)<key && list.get(i+1)>key){
                    max = Math.max(max,list.get(i+1));
                }
            }
        }
        
        return max;
        
    }
    public List<Integer> helper(Node root){
        if(root==null){
            return list;
        }
        helper(root.left);
        list.add(root.data);
        helper(root.right);
        
        return list;
    }
}
