//Check if a binary search tree is symmetric or not
/*
For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
*/
public boolean isSymmetric(TreeNode root) {
    //simply call helper function
    return isSym(root, root);
}

public boolean isSym(TreeNode root1, TreeNode root2){
    //check if both roots are null, this case is true bc they're equal
    if(root1 == null && root2 == null ) return true;
    //if either of them is null while the other is not, then its clearly false
    if(root1 == null || root2 == null) return false;
    //check to see if both values are the same
    if(root1.val == root2.val) {
      //check the right with left and left with right
      //essentially, checking to see if the opposite correcpoding node is same
      return isSym(root1.left, root2.right) && isSym(root1.right, root2.left);
    }
    return false;

}
