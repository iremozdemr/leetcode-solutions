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
        if(headA == null || headB == null){
            return null;
        }
        else{
            ListNode temp1 = headA;
            ListNode temp2 = headB;

            while(headA != null){
                headB = temp2;
                while(headB != null){
                    if(headA == headB){
                        return headA;
                    }
                    headB = headB.next;
                }
                headA = headA.next;
            }

            return null;
        }
    }
}