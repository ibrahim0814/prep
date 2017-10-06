boolean hasCycle(Node head) {

    if(head == null){

        return false;
    }

    Node slow = head;
    Node fast = head.next;

    while (slow != null && fast !=null && fast.next !=null){

        if(slow==fast){

            return true;
        }

        fast=fast.next.next;
        slow= slow.next;
    }

    return false;

}
