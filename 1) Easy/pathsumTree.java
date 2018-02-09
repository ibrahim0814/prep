/*
Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.

For example:
Given the below binary tree and sum = 22,
              5
             / \
            4   8
           /   / \
          11  13  4
         /  \      \
        7    2      1
return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
*/

//What i did here was define a helper function that keeps track of the current sum
//initialize current sum zero
public boolean hasPathSum(TreeNode root, int sum) {
    int currSum = 0;
    return helper(root,sum,currSum);

}

// the important thing to remember is that we need to check if the sum is reached at a leaf node. this means both right and left points are null for this node
//if the node doesn't add up to the sum, we continue looking through the right and left side of the tree. we don't care about the number of paths, we just care if one exists, which is why we use the || operator to figure out possible paths along the right and left side. each time, we increment the currentSum with the root value
public boolean helper(TreeNode root, int sum, int currSum){
    //step1: root is null
    if(root == null) return false;
    //we have a leaf node that adds up to the sum
    if(root.val + currSum == sum && root.left == null && root.right == null){ return true;
    //cotinue to check with both the left and right nodes, increment currSum
    return helper(root.left, sum, currSum+root.val) || helper(root.right, sum, currSum+root.val);
}
