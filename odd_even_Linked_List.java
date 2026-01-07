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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode temp=head;
        ListNode headsec=head.next;
        ListNode temph=headsec;
        while(temp.next!=null && temph.next!=null){
            temp.next=temph.next;
            temp=temp.next;
            temph.next=temp.next;
            temph=temph.next;
        }
            temp.next=headsec;
            return head;
    }
}
