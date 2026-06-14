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
        int count=1;
        ListNode temp=new ListNode();
        temp=head;
        ArrayList <Integer> list=new ArrayList<>();
        while(temp.next!=null){
            list.add(temp.val);
            temp=temp.next;
            count++;
        }
        list.add(temp.val);
        int output=0;
        for(int i=0;i<(count/2);i++){
            int step=list.get(i)+list.get(count-1-i);
            output=Math.max(output,step);
        }
        return output;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna