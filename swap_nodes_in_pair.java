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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=slow.next;
        if(head.next.next==null){
            fast.next=slow;
            slow.next=null;
            head=fast;
            return head;
        }
        ListNode temp=fast.next;
        ListNode prev=null;
        //...
        while(temp!=null && temp.next!=null){
          if(slow==head){
            fast.next=slow;
            head=fast;
            slow.next=temp;
            prev=slow;
            slow=temp;
            fast=slow.next;
            temp=fast.next;
            }
           else if(slow!=head){
            fast.next=slow;
            prev.next=fast;
            slow.next=temp;
            prev=slow;
            slow=temp;
            fast=slow.next;
            temp=fast.next;
            } 
        }
        //...
        if(temp==null){
            fast.next=slow;
            prev.next=fast;
            slow.next=temp;
            return head;
        }
        else if(temp.next==null){
            fast.next=slow;
            if(prev!=null){
                prev.next=fast;
            }
            else{
                head=fast;
            }
            slow.next=temp;
            return head;
        }
        
        return head;
    }
}