//Find the intersection of two linked Lists
/*
For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗
B:     b1 → b2 → b3
begin to intersect at node c1.
*/
//Diagram really helps here
//Essentially what you do is find the length of the two Lists
//Then you increment the larger list so that its pointer aligns with the smaller one. Now you know that they are equal distance apart from the intersection
//At this point, all you need to do is set up a while loop, increment both until the pointers are equal to each other and you're done
//If you get out of this while loop, then you know there is no intersection
public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode copyA = headA;
        ListNode copyB = headB;
        int lenA = 0;
        int lenB = 0;

        //get lengths of both lists
        while(copyA != null){
            lenA++;
            copyA = copyA.next;
        }

        while(copyB != null){
            lenB++;
            copyB = copyB.next;
        }

        ListNode copyA2 = headA;
        ListNode copyB2 = headB;

        //increment the larger list to align with the smaller one
        if(lenA>lenB){
            int diff = lenA-lenB;
            //i forgot to check the condition where copyA2 != null!
            while(diff > 0 && copyA2 != null){
                copyA2 = copyA2.next;
                diff--;
            }
        }else{
            int diff = lenB-lenA;
            while(diff > 0 && copyB2 != null){
                copyB2 = copyB2.next;
                diff--;
            }
        }

        //find intersection
        while(copyA2 != null && copyB2 != null){

            if(copyA2 == copyB2){return copyA2;}
            copyA2= copyA2.next;
            copyB2 = copyB2.next;
        }
        return null;
    }
