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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        ListNode prev = null;
        ListNode curr = head;
        int n = 0;
        ListNode temp = head;
        while(temp != null){
            n++;
            temp = temp.next;
        }

        int baseSize = n/k;
        int extraNodes = n%k;

        for(int i = 0 ; i < k; i++){
            if(curr == null){
                ans[i] = curr;
                continue;
            }
            ans[i] = curr;
            int width = baseSize + (extraNodes>0 ? 1 : 0);
            extraNodes--;
            for(int j=1; j<=width; j++){
                prev = curr;
                curr = curr.next;
            }
            prev.next = null;
            prev = null;  
        }
        return ans;


        
    }
}