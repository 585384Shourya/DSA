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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp1=head.next;
        ListNode temp2=head;
        int sum;
        while(temp1!=null){
            sum=0;
            while(temp1.val!=0){
                sum=sum+temp1.val;
                temp1=temp1.next;
            }
            temp2.val=sum;
            if(temp1.next==null){
                temp2.next=null;
                return head;
            }
            temp2.next=temp1;
            temp2=temp1;
            temp1=temp1.next;
        }
        return head;
    }
}