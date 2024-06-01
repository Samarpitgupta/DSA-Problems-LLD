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
    public ListNode rotateRight(ListNode head, int k) {
        
        // empty list or zero rotation -> return original head
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // calculate length
        int length = 1;
        ListNode temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
            length++;
        }

        // temp is pointing to last node
        // make the list circular
        temp.next = head;

        // determine the new head's position as per k
        k = k % length; // for larger k than length
        k = length - k;   

        while( k-- > 0) {
            temp = temp.next;
        }

        head = temp.next;
        temp.next = null;

        return head;
    }
}