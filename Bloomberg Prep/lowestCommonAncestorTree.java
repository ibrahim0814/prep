
//Find the lowest common ancestor of two tree nodes in a binary Tree
//First we're searching for the two Nodes
//If the root is either p or q we return root

//After we're done recursing, we have two pointers coming into every node
//They can either be p and q, p and null, q and null, or null and null
//If its both p and q, we return that node because we have found the ancestor
//If its p and null or q and null, we return p or q -- means we still need to go up a few levels
//If its null and null, we just return null

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        //base cases, either our root is null, or its p or q
        if(root == null){return null;}
        if(root == p || root == q){return root;}

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //deal with the two left and right pointers coming into every node
        if(left != null && right != null){return root;}

        //return which ever pointer is not null
        //for where l = null & r = null, we just end up returning null which works
        if(left != null){
            return left;
        }else{
            return right;
        }

}
