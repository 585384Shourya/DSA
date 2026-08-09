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
    public boolean identical(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            if(p!=null) return false;
            else if(q!=null) return false;
            else if(p==null && q==null) return true;
        }
        if(p.val!=q.val) return false;

        ///...
        boolean temp=true;
        temp=identical(p.left,q.left);
        if(temp==false) return false;
        temp=identical(p.right,q.right);

        return temp;
    }

    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return identical(p,q);
    }
}
