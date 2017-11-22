
//For this, the solution might not be what you expected
//We work our way backwards
//We define a post order traveral where we take the right, left, R order and build the linked list in a backwards manner
//Another important thing to remember is that we need to define "prev" as a provate variable outside of the scope of the method because we don't want to change when we're doing recursion
//Instead of setting root.left to prev, we set root.right to prev. For root.left, we don't really need it for anything so we can just ignore it and set it to null
//Then, we set prev to current (which is root) and keep going

/*
For example,
Given

         1
        / \
       2   5
      / \   \
     3   4   6
The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
*/
class Solution {

    private TreeNode prev = null;
    public void flatten(TreeNode root) {

        if(root == null){
           return;
       }
        flatten(root.right);
        flatten(root.left);

       // | 5 | ---------->| 6 |-->null
      //        null <----
        root.right = prev;
        root.left = null;
        prev = root;

    }
  }
