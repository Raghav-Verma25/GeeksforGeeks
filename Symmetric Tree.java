  if(root==null){
            return true;
        }
        Stack<TreeNode> stk = new Stack<>();
        stk.push(root.right);
        stk.push(root.left);
        while(!stk.isEmpty()){
            TreeNode n1 = stk.pop();
            TreeNode n2 = stk.pop();
            if(n1==null && n2==null){
                continue;
            }
            if(n1==null || n2==null || n1.val!=n2.val){
                return false;
            }
            stk.push(n1.left);
            stk.push(n2.right);
            stk.push(n1.right);
            stk.push(n2.left);
        }
        return true;
