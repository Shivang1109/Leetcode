/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return head;
        Node temp = head;
        while(temp != null){
            if(temp.child == null){
                temp = temp.next;
            } 
            else{
                Node var = temp.child;
                while(var.next != null){
                    var = var.next;
                }
                if(temp.next != null){
                    var.next = temp.next;
                    temp.next.prev = var;
                }
                temp.next = temp.child;
                temp.child.prev = temp;
                temp.child = null;
                temp = temp.next;
            }
        }
        return head;
        
    }
}