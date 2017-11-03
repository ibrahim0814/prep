
//Problem: firgure out if a binary search tree is balanced
//Two methods here
//Height method, returns an int -1 (false) or something greater than -1(true):
//if node is null, then return 0 because that is the height of a null node
//now we recursively figure out the heights of both sides
//we want to have a check for whether or not they are -1 before we compare the difference
//basically, if h1 or h2 is -1, then we know that one of the sides is not balanced, so we can just return -1 at that point
//after that we check to see is the difference between h1 and h2 is greater than 1 -- if it is, then we also return -1
//after that, both of our height are okay, so we take the max between them and add 1 and return that # --STILL DON'T UNDERSTAND THIS PART COMPLETELY, work it out

public boolean isBalanced(TreeNode root) {
    //call height recursively on the root node and if the return val is greater than -1, then we have a balanced tree 
    return height(root) > -1;
}

public int height(TreeNode root){

    if(root == null) return 0;
    int h1 = height(root.left);
    int h2 = height(root.right);

    if(h1 == -1 || h2 == -1) return -1;
    if(Math.abs(h1-h2) > 1) return -1;

    return 1 + Math.max(h1,h2);

}
