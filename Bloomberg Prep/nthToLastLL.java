//Find the value of the nth to the last element
//pretty straightforward
//set up two pointers, curr and prev
//keep incrementing curr so that its a distance n from prev
//increment curr and prev together after that (make sure the contdition is curr.next != null)
//return prev data

int GetNode(Node head,int n) {

    Node curr = head;
    Node prev = head;

    for(int i=0; i<n; ++i){

        curr= curr.next;
    }

    while(curr.next != null){

        curr = curr.next;
        prev= prev.next;
    }

    return prev.data;


}
