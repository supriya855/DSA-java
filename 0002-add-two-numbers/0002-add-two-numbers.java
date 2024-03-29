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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode();
        ListNode temp=dummy;
        int c=0;
        while(l1!=null||l2!=null||c==1){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.val;
               // System.out.println(sum);
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum=sum+c;
            c=sum/10;
            ListNode node= new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            
        }
        return dummy.next;
    }
}