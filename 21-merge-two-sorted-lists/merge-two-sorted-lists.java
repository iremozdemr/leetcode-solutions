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
import java.util.*; 

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }
       ArrayList<Integer> arrayList = new ArrayList<>();
       while(list1 != null){
        arrayList.add(list1.val);
        list1 = list1.next;
       }
       while(list2 != null){
        arrayList.add(list2.val);
        list2 = list2.next;
       }
       Collections.sort(arrayList);

       ListNode newHead = new ListNode(arrayList.get(0));
       ListNode temp = newHead;

       for(int i=1; i<arrayList.size(); i++){
        ListNode newNode = new ListNode();
        temp.next = newNode;
        newNode.val = arrayList.get(i);
        temp = temp.next;
       }
       return newHead;
    }
}