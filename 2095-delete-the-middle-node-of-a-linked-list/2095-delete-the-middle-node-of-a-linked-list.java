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
    static ListNode midNode(ListNode head){
        
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        return slow;
    }

    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head;

        ListNode mid = midNode(head);
        ListNode forward = mid.next;
        while(temp.next!=mid){
            //edge case when ther eis only 1 or 0 node;
            if(head == null || head.next == null){
                return null;
            }
            temp = temp.next;
        }
        temp.next = forward;
        mid.next = null;
        return head;

        
    }
}