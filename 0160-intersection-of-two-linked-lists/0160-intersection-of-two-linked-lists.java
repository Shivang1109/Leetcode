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
            for(int i=1;i<=diff;i++){
                a = a.next;
            }
        }
        else if(countB > countA){
            for(int i=1;i<=diff;i++){
                b = b.next;
            }
        }
        while(a != b){
            a = a.next;
            b = b.next;
        }
        return a;
        


        
    }
}