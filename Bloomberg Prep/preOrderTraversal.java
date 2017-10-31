
//Parents-->Left--->Right 


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
