boolean checkBST(Node root, int min, int max){

        //base case 
        if(root == null){

            return true;
        }

        //check exceptions to the rule because we don't want it to return if its true -- we need to check other cases 
        if(root.data < min || root.data > max){

            return false;

        }

        // recursive step -- the node to the left cannot be greater than our current node and node to the right has to be greater than our current node
        return checkBST(root.left, min, root.data-1) && checkBST(root.right, root.data+1, max);
    }

  boolean checkBST(Node root) {

      return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

  }
