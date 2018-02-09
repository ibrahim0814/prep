void postOrder (TreeNode root){

  //N --> L ---> R

  if(root == null){return;}
  System.out.println(root.val);
  if(root.left != null){preOrder(root.left);}
  if(root.right != null){preOrder(root.right);}

}
