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
    List<Integer> postOrder(List<Integer> lst,TreeNode root){
        if(root==null)return lst;
        postOrder(lst,root.left);
        postOrder(lst,root.right);
        lst.add(root.val);
        return lst;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> lst=new ArrayList<>();
       return  postOrder(lst,root);
    }
}
