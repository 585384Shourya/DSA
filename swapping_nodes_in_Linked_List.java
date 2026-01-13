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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        int i=1;
        while(i<=k){
            if(i==k){
                temp=fast;
            }
            fast=fast.next;
            i++;
        }
        //...
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //...
        int change=temp.val;
        temp.val=slow.val;
        slow.val=change;
        return head;
    }
}