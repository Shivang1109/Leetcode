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
    public ListNode swapNodes(ListNode head, int k) {
        //aek hi pass me dono k aur kth from end nikla ke bas values exchange kr denge;
        ListNode first = head;
        for(int i=1;i<k;i++){
            first = first.next;
        }
        ListNode temp = first.next;
        ListNode second = head;
        while(temp!=null){
            temp = temp.next;
            second = second.next;
        }
        //ab first aur second pointers k from start and k from end pe jaa chuka hai bas values swap krna hai 
        int value = first.val;
        first.val = second.val;
        second.val = value;
        return head;
        
        
    }
}