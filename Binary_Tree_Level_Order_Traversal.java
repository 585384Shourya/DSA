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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null) return lst;
        que.offer(root);

        ///...

        while(que.size()>0){
            int i=1,size=que.size();
            List<Integer> lst1 = new ArrayList<>();
            while(i<=size){
                lst1.add(que.peek().val);
                if(que.peek().left!=null) que.offer(que.peek().left);
                if(que.peek().right!=null) que.offer(que.peek().right);
                que.poll();
                i++;
            }
            lst.add(lst1);
        }

        return lst;
    }
}