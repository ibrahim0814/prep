//Steps
//1) Set up prev, curr, and next pointers
//2) Do not initialize next pointer bc you don't know if curr.next is non existant
//3) I recommend drawing it out on the whiteboard
//4) First set next to curr.next
//5) curr.next should now point to prev
//6) set prev to curr and then set curr to next
//7) MAKE SURE TO RETURN PREV BC CURR IS NULL

Node Reverse(Node head) {

    //set up three pointers
    Node prev = null;
    Node curr = head;
    Node next;

    //loop while curr is not null
    while(curr != null){

        next = curr.next;

        curr.next = prev;
        prev = curr;
        curr = next;

    }

    return prev;

}
