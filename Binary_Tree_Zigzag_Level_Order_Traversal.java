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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> lst = new ArrayList<>();
        if(root==null) return lst;
        que.offer(root);

        ///...
        boolean level=true;
        while(que.size()>0){
            int i=1,size=que.size();
            List<Integer> lst1 = new LinkedList<>();
            while(i<=size){
                if(level==true) lst1.addLast(que.peek().val);
                else lst1.addFirst(que.peek().val);
                if(que.peek().left!=null) que.offer(que.peek().left);
                if(que.peek().right!=null) que.offer(que.peek().right);
                que.poll();
                i++;
            }
            level=!level;
            lst.add(lst1);
        }

        return lst;
    }
}