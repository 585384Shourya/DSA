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
    ListNode reverseList(ListNode curr,ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode temp=reverseList(curr.next,curr);
        curr.next=prev;
        return temp;
    }
    //...
    public ListNode removeNodes(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode slow,fast;
        head=reverseList(head,null);
        slow=head;
        fast=slow.next;
    //...    
        while(fast!=null){
            if(fast.val<slow.val){
                fast=fast.next;
            }
            else if(fast.val>=slow.val){
                slow.next=fast;
                slow=fast;
                fast=fast.next;
            }
        }
        slow.next=null;
    //...    
        head=reverseList(head,null);
        return head;
    }
}
