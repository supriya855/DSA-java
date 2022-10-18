/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=len(headA);
        int lenB=len(headB);
        while(lenA>lenB){
            headA=headA.next;
            lenA--;
            }
           while(lenA<lenB){
            headB=headB.next;
               lenB--;
            }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
            
        }
        return headA;
    }
     public static int len(ListNode head){
         int l=0;
            ListNode temp=head;
            while(temp!=null){
                temp=temp.next;
              l++;
            }
            return l;
        }
}