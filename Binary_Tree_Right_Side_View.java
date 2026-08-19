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
    public void rightView(TreeNode root, int level, HashSet<Integer> st, List<Integer> lst){
        if(root==null) return;
        if(!st.contains(level)){
            st.add(level);
            lst.add(root.val);
        }

        rightView(root.right,level+1,st,lst);
        rightView(root.left,level+1,st,lst);

        return;
    }
    public List<Integer> rightSideView(TreeNode root) {
        HashSet<Integer> st = new HashSet<>();
        List<Integer> lst = new ArrayList<>();
        rightView(root,0,st,lst);

        return lst;
        
    }
}
