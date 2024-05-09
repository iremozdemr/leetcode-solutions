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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null){
            return null;
        }
        if(lists.length == 0){
            return null;
        }
        /*
        for(int i=0; i<lists.length; i++){
            if(lists[i] == null){
                return null;
            }
        }
        */
        ArrayList<Integer> arrayList = new ArrayList<>();

        int emptyNumber = 0;
        for(int i=0; i<lists.length; i++){
            if(lists[i] != null){
                ListNode head = lists[i];
                while(head != null){
                    arrayList.add(head.val);
                    head = head.next;
                }
            }
            else{
                emptyNumber++;
            }
        }
        if(emptyNumber == lists.length){
            return null;
        }
        
        Collections.sort(arrayList);

        ListNode newHead = new ListNode();
        newHead.val = arrayList.get(0);
        ListNode temp = newHead;

        for(int i=1; i<arrayList.size(); i++){
            ListNode newNode = new ListNode(arrayList.get(i));
            temp.next = newNode;
            temp = temp.next;
        }

        return newHead;
    }
}