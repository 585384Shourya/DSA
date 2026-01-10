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

    public ListNode reverseList(ListNode curr,ListNode prev){
        if(curr==null){
            return  prev;
        }
        ListNode temp=reverseList(curr.next,curr);
        curr.next=prev;
        return temp;
    }

    public void reorderList(ListNode head) {

        if(head.next==null){
            return;
        }

        ListNode slow=head;
        ListNode fast=head;
        ListNode temp;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        if(fast.next.next==null){
            temp=slow.next;
            slow.next=null;
           temp=reverseList(temp,null);
           slow=head;
           ListNode extra;
           while(temp!=null){
            extra=temp.next;
            temp.next=slow.next;
            slow.next=temp;
            //...
            slow=slow.next.next;
            temp=extra;
           }
        }
        else if(fast.next.next.next==null){
            temp=slow.next.next;
            temp=reverseList(temp,null);
            slow=head;
           ListNode extra;
           while(temp!=null){
            extra=temp.next;
            temp.next=slow.next;
            slow.next=temp;
            //...
            slow=slow.next.next;
            temp=extra;
           }
           slow.next=null;
        }


    }
}