
//have a queue with type Node
//add the root node to the queue
//while the queue is not empty, keep going.
//use poll to remove the element
//if left and right are not null, then add them to the queue

void levelOrder(Node root) {

     Queue<Node> q = new LinkedList<>();
     q.add(root);

     while(!q.isEmpty()){

         Node elem = q.poll();
         System.out.print(elem.data+" ");

         if(elem.left != null) q.add(elem.left);
         if(elem.right != null) q.add(elem.right);

   }
}
