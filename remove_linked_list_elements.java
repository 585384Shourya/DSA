/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp1=head;
        if(temp1==null){
            return head;
        }
        ListNode temp2=temp1.next;
        while(temp1!=null || temp2!=null){
            if(head.val==val){
                head=head.next;
                temp1=head;
                if(temp1==null){
                    return head;
                }
                temp2=temp1.next;
            }
            
            else if(temp2!=null && temp2.val==val){
                temp1.next=temp2.next;
                temp2=temp2.next;
            }
            else{
                temp1=temp1.next;
                if(temp1==null){
                    return head;
                }
                temp2=temp2.next;
            }
        }
        return head;
    }
}
