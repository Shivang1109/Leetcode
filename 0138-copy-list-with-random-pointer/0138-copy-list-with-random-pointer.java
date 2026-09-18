/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return head;
        Node temp = head;
        //1 add copy nodes in between original nodes;
        while(temp != null){
            Node newNode = new Node(temp.val);
            newNode.next = temp.next;
            temp.next = newNode;
            temp = newNode.next;
        }
        //2 random pointer manipulation;
        Node oldNode = head;
        Node newNode = head.next;
        while(oldNode != null){
            if(oldNode.random == null) newNode.random = null;
            else newNode.random = oldNode.random.next;
            oldNode = newNode.next;
            newNode = oldNode !=null ? oldNode.next : null;
        }
        oldNode = head;
        newNode = head.next;
        Node ans = head.next;
        while(oldNode != null){
            oldNode.next = newNode.next;
            oldNode = oldNode.next;
            newNode.next = oldNode != null ? oldNode.next : null;
            newNode = newNode.next != null ? newNode.next : null;
        
        }
        return ans;
    }
}