/*

Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9


to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

Basically we have to check if the root is null, if not, recurse both left and right nodes
Once we're done recursing, then we wanna swap left and right nodes
*/
public TreeNode invertTree(TreeNode root){

  if(root != null){

     invertTree(root.left);
     invertTree(root.right);
     TreeNode temp = root.right;
     root.right = root.left;
     root.left = temp;

   }

  return root;

}
