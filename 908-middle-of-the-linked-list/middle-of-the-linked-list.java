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
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        int size = 1;
        ListNode temp1 = head;
        while(temp1.next != null){
            temp1 = temp1.next;
            size++;
        }
        int index = (size/2)+1;
        ListNode temp2 = head;
        for(int i = 0; i<index-1; i++){
            temp2 = temp2.next;
        }
        return temp2;
    }
}