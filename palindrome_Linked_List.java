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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //...
        if(fast.next.next==null){
            temp=slow.next;
            slow.next=null;
        }
        else if(fast.next.next.next==null){
            temp=slow.next.next;
            slow.next=null;
        }

        //now reversing second half of linked list iterratively..
        ListNode tempp=temp.next;
        if(tempp==null){
            if(temp.val==head.val){
                return true;
            }
            else{
                return false;
            }
        }
        ListNode temps=tempp.next;
        temp.next=null;
        while(temps!=null){
            tempp.next=temp;
            temp=tempp;
            tempp=temps;
            temps=temps.next;
        }
        tempp.next=temp;

        //now checking for palindrome..
        while(tempp!=null && head!=null){
            if(tempp.val!=head.val){
                return false;
            }
            head=head.next;
            tempp=tempp.next;
        }
        return true;
    }
}
