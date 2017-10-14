// basically swap every two nodes
// 1-->2-->3-->4
//2-->1-->4-->3

//cannot change the values!

//Steps
//1) This is a recursive problem
//2) first check to see whether head or head.next is null (base case)
//3) then create new node that points to head
//4) our head.next is going to be the result of the recursive step
//5) set n.next (our new node which is essentially the second element in a swap) to the first element which is head -- this makes n our new head
//6) return n

public ListNode swapPairs(ListNode head) {



        // [1] --> [2] --> [3] --> [4]
        //  h       n

        // head next should be the result of whatever the recursive step returns for the third value
        // at the end we want to put n.next to head
        // then return n which is our new head

        if(head == null || head.next == null){
            return head;

        }
        ListNode n = head.next;
        head.next = swapPairs(n.next);
        n.next = head;
        return n;

    }
