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
        if(curr==null)return prev;
        ListNode temp=reverseList(curr.next,curr);
        curr.next=prev;
        return temp;
    }
    //...
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //...
        ListNode rev=slow.next;
        slow.next=null;
        ListNode shead=reverseList(rev,null);
        //...
        ListNode temp1=head;
        ListNode temp2=shead;
        int max=Integer.MIN_VALUE;
        while(temp1!=null){// && temp2!=null
            if((temp1.val+temp2.val)>max){
                max=temp1.val+temp2.val;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }

        return max;
    }
}
