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
    public int getDecimalValue(ListNode head) {
        StringBuilder ans = new StringBuilder();
        ListNode temp = head;
        while(temp!=null){
            ans.append(temp.val);
            temp = temp.next;
        }
        String res = ans.toString();
        int k = 0;
        int num = 0;
        for(int i = res.length()-1; i>=0; i--){
            char ch = res.charAt(i);
            int dig = ch - '0';
            num += dig * (int)Math.pow(2,k);
            k++;
        }
        return num;
        
    }
}