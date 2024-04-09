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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        else{
            for(int k = 0; k<50; k++){
                ListNode temp = head;
                int i = 0;
                while(temp != null && temp.next != null){
                    if(i == 0){
                        if(temp.val == val){
                            head = head.next;
                            temp = head;
                            temp = temp.next;
                        }
                    }
                    else{
                        if(temp.next.val == val){
                            remove(temp);
                        }
                        temp = temp.next;
                    }
                    i++;
                }
            }
            if(head.val == val){
                head = null;
            }
            return head;
        }
    }

    public void remove(ListNode prev){
        prev.next = prev.next.next;
    }
}