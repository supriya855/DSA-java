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
        int res=0,c=0;
        if(head.next==null){
            res=res+head.val;
            return res;
        }
     
        ListNode prev=null;
        ListNode curr=head;
        ListNode Next=curr.next;
        while(curr!=null){
             curr.next=prev;
            prev=curr;
            curr=Next;
            if(Next!=null)
            Next=Next.next;
          
        }
        head=prev;
        ListNode temp=head;
        while(temp!=null){
            res=res+temp.val*(int)(Math.pow(2,c));
             System.out.println(temp.val);
            
          // System.out.println(c);
            c++;
            temp=temp.next;
        }
        return res;
    }
}