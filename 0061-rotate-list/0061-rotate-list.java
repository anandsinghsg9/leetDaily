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

        ListNode temp=head; 
        int count=0;
        if(temp==null){
            return null;
        }
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int rotate=k%count;
        int newTail=count-rotate;
        ListNode temp2=head;
        ListNode tail=head;
        while(newTail>0){
            tail=temp2;
            temp2=temp2.next;
            newTail--;
        }
        ListNode temp3=head;
        while(count>1){
            temp3=temp3.next;
            count--;
        }
        temp3.next=head;
        ListNode newHead=tail.next;
        tail.next=null;
        return newHead;
    }
}