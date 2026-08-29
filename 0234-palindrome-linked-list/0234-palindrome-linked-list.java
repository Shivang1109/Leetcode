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

    static ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null){
            fast = fast.next;
            if(fast!=null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }

    static ListNode reverseLL(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        //two edge cases
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }

        //find mid using slow and fast pointer
        ListNode head2 = findMid(head);

        //separate two lists
        ListNode temp = head;
        while(temp.next != head2){
            temp = temp.next;
        }
        //unlink the link
        temp.next = null;

        // reverse the second list
        ListNode revHead2 = reverseLL(head2);


        //compare both lists
        while(head != null && revHead2 != null){
            if(head.val != revHead2.val){
                return false;
            }
            else{
                head = head.next;
                revHead2 = revHead2.next;
            }
        }
        return true;   
    }
}