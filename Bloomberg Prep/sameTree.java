// Problem: check to see if two binary trees are the same given root node
//pretty straightforward
//first want to validate that we don't have a case where 1 node is null and the other isn't
//then want to check if both are null, return true in this case because we're done
//then we want to check the values -- if they're the same, check both right and left nodes of both trees
public boolean isSameTree(TreeNode p, TreeNode q) {

        if((p == null && q != null) || (q == null && p != null)) return false;
        if(p == null && q == null) return true;
        if(p.val == q.val){
            //PAY ATTENTION TO THIS RETURN STATEMENT!!
            return isSameTree(p.right,q.right) && isSameTree(p.left, q.left);
        }else{
            return false;
        }
}
