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
    static ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }
    static ListNode merge(ListNode left, ListNode right){
        ListNode list1 = left;
        ListNode list2 = right;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
            else{
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return dummy.next;

    }
    static ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode mid = middle(head);
        ListNode right = mid.next;
        mid.next = null;
        ListNode left = head;
        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left,right);

        
    }
    public ListNode sortList(ListNode head) {
        // MERGE SORT APPROACH
        head = mergeSort(head);
        return head;

    
    }
}