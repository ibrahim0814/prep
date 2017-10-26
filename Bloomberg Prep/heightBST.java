//Find height of binary search tree
//pretty simple
//you don't really need a base case
//just need to know if left or right are both not null
//if they are then you don't need to do anything
//if not, then add 1 and continue to recurse

static int height(Node root) {

        int maxRight = 0;
        int maxLeft = 0;

        if(root.right != null){

            maxRight = 1 + height(root.right);
        }

        if(root.left != null){
            maxLeft = 1+height(root.left);
        }


        if(maxRight>maxLeft){
            return maxRight;
        }else{

            return maxLeft;
        }
    }
