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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] arr = {-1,-1};
        if(head.next==null || head.next.next==null) return arr;
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        ///...
        ListNode temp=head;
        int prev=temp.val;
        temp=temp.next;
        int count=2,marked=0,criticalMin=0,criticalMax=0;
        while(temp!=null){
            if(temp.next!=null && (temp.val>prev && temp.val>temp.next.val || temp.val<prev && temp.val<temp.next.val)){
                if(marked==0){
                    marked=1;
                    criticalMax=count;
                } 
                else{
                    max=Math.max(count-criticalMax,max);
                    min=Math.min(count-criticalMin,min);
                }
                criticalMin=count;
            }

            ///...
            prev=temp.val;
            temp=temp.next;
            count++;
        }
        
        if(max==Integer.MIN_VALUE && min==Integer.MAX_VALUE){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0]=min;
        arr[1]=max;

        return arr;
    }
}
