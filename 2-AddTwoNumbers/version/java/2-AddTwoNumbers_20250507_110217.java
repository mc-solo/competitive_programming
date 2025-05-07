// Last updated: 5/7/2025, 11:02:17 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode a = l1, b = l2, current = dummyHead;

        int carry = 0;
        while(a != null || b != null) {
            int x = (a != null) ? a.val : 0;
            int y = (b != null) ? b.val : 0;

            int digit = carry + x +y;
            carry = digit/10;
            current.next = new ListNode(digit % 10);
            current = current.next;

            if (a != null) a = a.next;
            if (b != null) b = b.next;
        } 


        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}