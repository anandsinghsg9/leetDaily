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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(head.next==null){
            return null;
        }
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp=head;
        for(int i=1;i<(count-n);i++){
            temp=temp.next;
        }
        if((temp==head) && (count-n)==0){
            head=temp.next;
        }
        else{
            temp.next=temp.next.next;
        }
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/leethub-v4/bcilpkkbokcopmabingnndookdogmbna