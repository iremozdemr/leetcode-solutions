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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        else{
            ListNode temp = head;
            if(temp == head){
                ListNode node1 = temp;
                ListNode node2 = temp.next;
                ListNode node2next = node2.next;
                head = node2;
                node2.next = node1;
                node1.next = node2next;
            }
            while(temp.next != null && temp.next.next != null){
                ListNode node1prev = temp;
                ListNode node1 = temp.next;
                ListNode node2 = temp.next.next;
                ListNode node2next = temp.next.next.next;
                node1.next = node2.next;
                node1prev.next = node2;
                node2.next = node1;
                temp = temp.next.next;
            }
            return head;
        }
    }
}