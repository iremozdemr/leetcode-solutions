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
    public ListNode sortList(ListNode head) {
        if(head == null){
            return null;
        }
        else{
            ListNode temp1 = head;
            ArrayList<Integer> list = new ArrayList<>();

            while(temp1.next != null){
                list.add(temp1.val);
                temp1 = temp1.next;
            }
            list.add(temp1.val);

            Collections.sort(list);
            int length = list.size();

            ListNode newHead = new ListNode(list.get(0));
            ListNode temp2 = newHead;

            for(int i=1; i<length; i++){
                ListNode newNode = new ListNode(list.get(i));
                temp2.next = newNode;
                temp2 = temp2.next;
            }

            return newHead;
        }
    }
}