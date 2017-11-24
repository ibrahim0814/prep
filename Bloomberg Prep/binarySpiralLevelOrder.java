
//The objective is to print out a binary tree in a spiral pattern:
/*
For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its zigzag level order traversal as:
[
  [3],
  [20,9],
  [15,7]
]
*/

//The trick here is to use two stacks. One in order to maintain the left-->right order and the other to maintain the right-->left order

//Basically, you push the root into either stack(depending on which order you want, then when you pop it, you push the child nodes into the other stack from either left to right or right to left)
//then we go through all the child nodes and push their children into the other stack and so on and so forth
//You want to keep going until both stacks run out of stuff
public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        Stack<TreeNode> rightLeft = new Stack<>();
        Stack<TreeNode> leftRight = new Stack<>();
        List<List<Integer>> fin = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        if(root != null){rightLeft.push(root);}

        while(!rightLeft.isEmpty() || !leftRight.isEmpty()){

            //go through all the Nodes
            //push their values into one of the two lists
            //then push children node into other stack: right, then left
            while(!rightLeft.isEmpty()){
                TreeNode tempNode = rightLeft.pop();
                one.add(tempNode.val);
                if(tempNode.right != null){leftRight.push(tempNode.right);}
                if(tempNode.left != null){leftRight.push(tempNode.left);}
            }

            //push children into other stack from left to right
            while(!leftRight.isEmpty()){
                TreeNode tempNode = leftRight.pop();
                two.add(tempNode.val);
                if(tempNode.left != null){rightLeft.push(tempNode.left);}
                if(tempNode.right != null){rightLeft.push(tempNode.right);}
            }

            //if either of the two lists are not empty, add to the final
            if(!one.isEmpty()){fin.add(new ArrayList<>(one));}
            if(!two.isEmpty()){fin.add(new ArrayList<>(two));}
            //clear both lists for next iteration
            one.clear();
            two.clear();
        }

        return fin;

    }
