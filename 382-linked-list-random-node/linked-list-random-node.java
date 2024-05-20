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

    ListNode head = null;

    public Solution(ListNode head) {
        this.head = head;
    }
    
    public int getRandom() {
        Random random = new Random();
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int index = 0;
        int length = 1;

        while(temp.next != null){
            list.add(temp.val);
            temp = temp.next;
            length++;
        }
        list.add(temp.val);

        index = random.nextInt(length);
        result = list.get(index);
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */