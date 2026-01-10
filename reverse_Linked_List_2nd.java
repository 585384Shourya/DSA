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
            return prev;
        } 
        ListNode ans=reverseList(curr.next,curr);
        curr.next=prev;
        return ans;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next==null){
            return head;
        }
        ListNode newhead=null;
        ListNode newtail=null;
        ListNode temp=head;
        ListNode memhead=null;
        ListNode memtail=null;
        ListNode extra=null;
        int i=1;
        while(i<=right){
            if(i==left){
                newhead=temp;
            }
            if(i==right){
                newtail=temp;
                break;
            }
            //...
            if(i==left-1){
                memhead=temp;
            }
            //...
            temp=temp.next;
            i++;

        }
        //...
        memtail=temp.next;
        temp.next=null;
        temp=reverseList(newhead,null);
        if(left!=1){
            memhead.next=temp;
        }
        else if(left==1){
            extra=temp;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=memtail;
        if(left==1){
            return extra;
        }

        return head;
    }
}
