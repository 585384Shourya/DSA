/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=0,len2=0;
        ListNode tempA=headA;
        ListNode tempB=headB;

        //finding length of linked list headA..
        while(tempA!=null){
            tempA=tempA.next;
            len1++;
        }
        tempA=headA;

        //finding length of linked list headB..
        while(tempB!=null){
            tempB=tempB.next;
            len2++;
        }
        tempB=headB;
        
        // comparing length..
        if(len1>len2){
            int i=1;
            while(i<=len1-len2){
                tempA=tempA.next;
                i++;
            }
        }
        // comparing length..
        else if(len2>len1){
            int i=1;
            while(i<=len2-len1){
                tempB=tempB.next;
                i++;
            }
        }

        // Now finding intersection..
        while(tempA!=tempB){
            tempA=tempA.next;
            tempB=tempB.next;

            if(tempA==null && tempB==null){
            return null;
            }
        }

        return tempA;
    }
}
