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
    public void paths(TreeNode root, List<String> lst, String str){
        if(root==null){
            return;
        }

        ///...
        if(str.isEmpty()) str+=root.val;
        else str+="->"+root.val;

        if(root.left==null && root.right==null) lst.add(str);

        paths(root.left,lst,str);
        paths(root.right,lst,str);

        return;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lst = new ArrayList<>();
        paths(root,lst,"");
        return lst;
    }
}