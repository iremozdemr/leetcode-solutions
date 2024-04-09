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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        int size = findSize(head);
        System.out.println(size);
        if(n > size){
            return null;
        }
        if(n <= 0){
            return null;
        }
        if(size == 1 && n == 1){
            head = null;
            return head;
        }
        int index = size-n;
        if(index == 0){
            head = head.next;
            return head;
        }
        System.out.println(index);
        removeByIndex(index,head);
        return head;
    }

    public void removeByIndex(int index,ListNode head){
        ListNode temp1 = head;
        ListNode temp2 = head;
        int size = findSize(temp1);
        if(index == size-1){
            while(temp2.next.next != null){
                temp2 = temp2.next;
            }
            temp2.next = null;
        }
        else{
            ListNode temp = head;
            for(int i = 0;i<index-1;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }

    public int findSize(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}