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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null){
            return head;
        }

        ListNode temp=head;
        int sz=1;
        while(temp.next!=null){
            temp=temp.next;
            sz++;
        }
        //...
        int rot=k%sz;
        int ct=sz-rot;
        int i=1;
        temp=head;
        while(i<ct){
            temp=temp.next;
            i++;
        } 
        ListNode shead=temp.next;
        if(shead==null){
            return head;
        }
        temp.next=null;
        //...
        temp=shead;
        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=head;
        head=shead;
        return head;
    }
}
