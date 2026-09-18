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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode revHead = reverse(head);
        ListNode temp = revHead;
        int carry = 0;
        while(revHead != null){
            int prod = (revHead.val * 2) + carry;
            revHead.val = prod % 10;
            carry = prod / 10;
            revHead = revHead.next;
        }
        ListNode dummy = new ListNode(-1);
        head = reverse(temp);
        if(carry != 0){
            dummy.val = carry;
            dummy.next = head;
            return dummy;
        }
        return head;
        
        
    }
}