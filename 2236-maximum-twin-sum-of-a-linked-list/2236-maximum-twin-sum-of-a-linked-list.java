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
    public int pairSum(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode slowPoint=head;
        ListNode fastPoint=head;
        while(fastPoint!=null){
            slowPoint=slowPoint.next;
            fastPoint=fastPoint.next.next;
        }
        ListNode prev=null;
        while(slowPoint!=null){
            ListNode next=slowPoint.next;
            slowPoint.next=prev;
            prev=slowPoint;
            slowPoint=next;
        }
        slowPoint=prev;
        int output=0;
        fastPoint=head;
        while(slowPoint!=null){
            int step=fastPoint.val+slowPoint.val;
            output=Math.max(step,output);
            fastPoint=fastPoint.next;
            slowPoint=slowPoint.next;
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna