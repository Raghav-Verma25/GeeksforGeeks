class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if(node==null){
            return 0;
        }
        if(node.left==null && node.right==null){
            return 1;
        }
        int left_height = height(node.left);
        int right_height = height(node.right);
        int res = Math.max(left_height , right_height);
        return res+1;
        
    }
}
