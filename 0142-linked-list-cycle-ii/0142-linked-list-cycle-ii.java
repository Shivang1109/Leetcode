/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode,Boolean> map = new HashMap<>();
        while(temp != null){
            if(!map.containsKey(temp)){
                map.put(temp,true);
                temp = temp.next;
            }
            else{
                return temp;
            }
        }
        return null;

        
    }
}