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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode curr = head.next;
        ListNode prev = head;
        int count = 1;
        while(curr.next!=null){
            if((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)){
               arr.add(count);
            }
            prev = prev.next;
            curr = curr.next;
            count++;
        }
        System.out.println(arr);
        if(arr.size() < 2) return new int[]{-1,-1};
        int max = arr.get(arr.size()-1) - arr.get(0);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.size();i++){
            min = Math.min(min, arr.get(i)-arr.get(i-1));
        }
        return new int[]{min,max};    
    }
}