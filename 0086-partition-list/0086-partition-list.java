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
    public ListNode partition(ListNode head, int x) {
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while(temp != null){
            if(temp.val >= x){
                greaterTail.next = temp;
                greaterTail = temp;
            }
            else{
                lesserTail.next = temp;
                lesserTail = temp;
            }
            temp = temp.next;
        }

        lesserTail.next = greaterHead.next;
        greaterTail.next = null;

        return lesserHead.next;
        
    }
}