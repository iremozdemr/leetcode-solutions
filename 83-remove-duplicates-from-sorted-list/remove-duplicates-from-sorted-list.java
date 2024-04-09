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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        else if(head.next == null){
            return head;
        }
        else{
            for(int i = 0; i<100; i++){
                ListNode temp = head;
                while(temp != null && temp.next != null){
                    if(temp.val == temp.next.val){
                        remove(temp);
                    }
                    temp = temp.next;
                }
            }
            
            return head;
        }
    }

    public void remove(ListNode prev){
        ListNode node = prev.next.next;
        prev.next = prev.next.next;
    }
}