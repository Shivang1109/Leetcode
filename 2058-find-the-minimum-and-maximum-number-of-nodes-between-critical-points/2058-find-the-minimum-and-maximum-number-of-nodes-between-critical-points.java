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
        int[] arr = new int[len]; 
        int k = 0;
        ListNode curr = head.next;
        ListNode prev = head;
        int count = 1;
        while(curr.next!=null){
            if((curr.val > prev.val && curr.val > curr.next.val) || (curr.val < prev.val && curr.val < curr.next.val)){
               arr[k++] = count;
            }
            prev = prev.next;
            curr = curr.next;
            count++;
        }
        // for(int i:arr){
        //     System.out.println(i);
        // }
        if(k==0 || k==1) return new int[]{-1,-1};
        int max = arr[k-1] - arr[0];
        int min = Integer.MAX_VALUE;
        for(int i=1;i<k;i++){
            min = Math.min(min, arr[i]-arr[i-1]);
        }
        return new int[]{min,max};

        
    }
}