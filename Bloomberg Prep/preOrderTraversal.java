
//Node --> Left ---> Right
/*
Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4
Sample Output

1 2 5 3 4 6
*/

void preOrder(Node root) {

    if(root != null){
        System.out.print(root.data+" ");
    }

    if(root.left != null){

        //System.out.print(root.left.data);
        preOrder(root.left);
    }

    if(root.right != null){

        //System.out.print(root.right.data);
        preOrder(root.right);
    }

}
