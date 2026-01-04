/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public int lengthOfLoop(Node head) {
        // code here
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        
        if(fast==null || fast.next==null){
            return 0;
        }
        else{//when there is a loop
        slow=slow.next;
        int count=1;
            while(slow!=fast){
                slow=slow.next;
                count++;
                
            }
            return count;
        }
        
    }
}
