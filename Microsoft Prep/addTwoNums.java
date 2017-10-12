/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       int carry = 0;
       int sum = 0;
       ListNode result = new ListNode(0);

       //copy is a pointer to our head because we're changing result in the loop
       ListNode copy = result;


       while(l1 != null || l2 != null || carry != 0){

           //need to make sure to set sum = 0 every iteration
           sum = 0;
           if(l1 !=null){
               sum+=l1.val;
               l1 = l1.next;
           }

           if(l2 != null){
               sum += l2.val;
               l2=l2.next;
           }

           //add the carry to sum
           sum+=carry;

           //get the digit we need to insert. example 12 -- carry is 1, digit //is 2

           //mod to get last digit
           int digit = sum%10;

           //divide to get first digit
           carry = sum/10;

           //insert the new node
           result.next = new ListNode(digit);

           //increment result
           result = result.next;

       }

       //we set the head to zero, so we want the next value which is our //beginning
       return copy.next;

    }
}
