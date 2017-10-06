bool has_cycle(Node* head) {



    if(head == null){

        return false;
    }

    Node* slow = head;
    Node* fast = head;

    while (slow != null && fast !=null){

        if(slow==fast){

            return true;
        }

        fast=fast.next.next;
        slow= slow.next;
    }

    return false;


}
