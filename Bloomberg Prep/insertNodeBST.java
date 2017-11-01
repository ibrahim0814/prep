//pretty simple
//think it through like you normally would
// first check to see if root is null, if it is, create a new node and add val
//then check to see if left is null and val is less than current data val
//then check to see if right is null and val is less than current data val
//^^ if those are true then we've found where to insert
//if not, then we need to keep searching
//recurse if right or left is not null and data val is less/greater than curr val


static Node Insert(Node root,int value) {

        //base case where root is null
        if(root == null){

            root = new Node();
            root.data = value;

            return root;
        }

        //if two below if statements are true, then we've found where to insert
        if(root.data > value && root.left == null){

            root.left = new Node();
            root.left.data = value;

        } else if (root.data < value && root.right == null){

            root.right = new Node();
            root.right.data = value;
        }

        //recursive step where we just call insert on the right or left node
        if(root.data > value && root.left != null){

            Insert(root.left, value);
        } else if( root.data < value && root.right != null){

            Insert(root.right, value);
        }


        return root;

    }
