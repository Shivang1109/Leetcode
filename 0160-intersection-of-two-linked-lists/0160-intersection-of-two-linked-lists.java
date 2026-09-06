/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        int countA = 0;
        int countB = 0;
        while(a != null){
            a = a.next;
            countA++;
        }
        while(b!=null){
            b = b.next;
            countB++;
        }
        int diff = Math.abs(countA - countB);
        a = headA;
        b = headB;
        if(countA > countB){
            while(diff>0){
                a = a.next;
                diff--;
            }
        }
        else if(countB > countA){
            while(diff>0){
                b= b.next;
                diff--;
            }
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
        


        
    }
}