/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node head=null;
        Node prev=null;
        Node curr=root;
        while(curr!=null){
            while(curr!=null){
                if(curr.left!=null){
                    if(prev!=null){
                        prev.next=curr.left;
                    }
                    else{
                        head=curr.left;
                    }
                
                prev=curr.left;
                }
                if(curr.right!=null){
                    if(prev!=null){
                        prev.next=curr.right;
                    }
                    else{
                        head=curr.right;
                    }
                    prev=curr.right;
                }
                curr=curr.next;
            }
            curr=head;
            prev=null;
            head=null;
        }
        return root;
    }
    
}