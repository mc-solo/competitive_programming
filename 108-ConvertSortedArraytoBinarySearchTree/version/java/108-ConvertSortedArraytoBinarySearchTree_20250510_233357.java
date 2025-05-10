// Last updated: 5/10/2025, 11:33:57 PM
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
    public TreeNode sortedArrayToBST(int[] num) {
        return sortedArrayToBST(num, 0, num.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] arr, int start, int end) {
        if (start > end)
            return null;
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }
}