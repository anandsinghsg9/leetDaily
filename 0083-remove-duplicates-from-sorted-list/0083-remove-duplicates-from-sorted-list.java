/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // If the list is empty or has only one element, no duplicates possible
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode curr = head;
        
        // Traverse the list
        while (curr != null && curr.next != null) {
            // Check if the current value is the same as the next value
            if (curr.val == curr.next.val) {
                // Skip the duplicate node
                curr.next = curr.next.next;
            } else {
                // Only move forward if no duplicate was found
                curr = curr.next;
            }
        }
        
        return head;
    }
}