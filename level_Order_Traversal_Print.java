import java.util.*;

class Node{
    int val;
    int level;
    Node left;
    Node right;

    Node(int val, int level){
        this.val=val;
        this.level=level;
    }
}

class Main {
    public static void levelOrder(Node root){
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        int level=0;

        ///...
        while(que.size()!=0){

            if(level==que.peek().level) System.out.print(" "+que.peek().val+" ");
            else if(que.peek().level>level){
                level++;
                System.out.println();
                System.out.print(" "+que.peek().val+" ");
            }

            if(que.peek().left!=null) que.offer(que.peek().left);
            if(que.peek().right!=null) que.offer(que.peek().right);

            que.poll();
               
        } 

        return;
    }

    public static void main(String[] args) {
       Node a=new Node(3,0);
       Node b=new Node(4,1);
       Node c=new Node(-1,2);
       Node d=new Node(1,2);
       Node e=new Node(2,1);
       Node f=new Node(9,2);
       a.left=b;a.right=e;
       b.right=d;b.left=c;
       e.right=f;

       levelOrder(a);

    }
}