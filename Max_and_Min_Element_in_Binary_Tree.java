/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}*/

class Solution {
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }
    public static int findMax(Node root) {
        return max(root);
        
    }
    
    
    ///...
    
    
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(min(root.left),min(root.right)));
    }

    public static int findMin(Node root) {
        return min(root);
    }
}
