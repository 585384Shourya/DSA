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

    public ListNode revrec(ListNode curr,ListNode prev){
        if(curr==null){
            return prev;
        }
        ListNode h=revrec(curr.next,curr);
        curr.next=prev;
        return h;
    }
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode h=revrec(temp.next,temp);
        head.next=null;
        return h;
    }
}