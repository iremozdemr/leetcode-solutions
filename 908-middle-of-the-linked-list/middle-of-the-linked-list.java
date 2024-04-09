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
        int size = 0;
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        int index;
        if(size%2 == 1){
            index = (size/2);
        }
        else{
            index = size/2-1;
        }
        ListNode temp2 = head;
        for(int i = 0; i<=index; i++){
            temp2 = temp2.next;
        }
        return temp2;
    }
}