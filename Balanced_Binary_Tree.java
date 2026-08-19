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
    public int balance(TreeNode root){
        if(root==null) return 0;

        int temp1=balance(root.left);
        if(temp1==Integer.MIN_VALUE) return Integer.MIN_VALUE;
        int temp2=balance(root.right);
        if(temp2==Integer.MIN_VALUE) return Integer.MIN_VALUE;

        if(Math.abs(temp1-temp2)>1) return Integer.MIN_VALUE;

        return 1+Math.max(temp1,temp2);
    }
    public boolean isBalanced(TreeNode root) {
        return balance(root)==Integer.MIN_VALUE ? false : true;
    }
}