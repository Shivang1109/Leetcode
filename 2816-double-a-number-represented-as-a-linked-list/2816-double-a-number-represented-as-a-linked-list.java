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
        while(temp != null){
            int prod = (temp.val * 2) + carry;
            temp.val = prod % 10;
            carry = prod / 10;
            temp = temp.next;
        }
        head = reverse(revHead);
        if(carry != 0){
            ListNode newNode = new ListNode(carry);
            newNode.next = head;
            head = newNode;
        }
        return head;
        
        
    }
}