// L --> R ---> Node


void postOrder(Node root) {

    if(root.left != null){
        postOrder(root.left);
    }


    if(root.right != null){
        postOrder(root.right);

    }

    if(root != null){
        System.out.print(root.data +" ");
    }

}
