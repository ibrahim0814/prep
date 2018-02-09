
//Steps
//1) This is a recursive Problem
//2) base case: if l1 and l2 are null return the other
//3) if the value is less than, then that is our result for the Steps
//4) now we need to get the next node, so result.next = mergeTwoLists. here we only need to increment the node we set our result to
//5) finally, return the result

//iterative solution -- honestly much easier to understand

public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode copy = head;

        while(l1 != null || l2 != null){

            if(l1 != null && l2 != null){
                if(l1.val < l2.val){
                    head.next = l1;
                    l1 = l1.next;
                }else{
                    head.next = l2;
                    l2 = l2.next;
                }
                head = head.next;
            }else if(l1 != null && l2 == null){
                head.next = l1;
                l1 = l1.next;
                head = head.next;
            } else{
                head.next = l2;
                l2 = l2.next;
                head = head.next;
            }
        }

        return copy.next;

}
//recursive solution
public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode result = null;
        if(l1.val > l2.val){
            result = l2;
            result.next = mergeTwoLists(l1, l2.next);
        }else{
            result = l1;
            result.next = mergeTwoLists(l1.next, l2);


        }

        return result;


    }
