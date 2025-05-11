// Last updated: 5/11/2025, 9:06:57 PM
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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private ListNode list;

    private TreeNode sortedListToBST(int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode leftChild = sortedListToBST(start, mid - 1);
        TreeNode parent = new TreeNode(list.val);
        parent.left = leftChild;
        list = list.next;
        parent.right = sortedListToBST(mid + 1, end);
        return parent;
    }

    public TreeNode sortedListToBST(ListNode head) {
        int n = 0;
        ListNode p = head;
        while (p != null) {
            p = p.next;
            n++;
        }
        list = head;
        return sortedListToBST(0, n - 1);
    }
}