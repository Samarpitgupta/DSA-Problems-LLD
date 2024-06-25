/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)
            return null;
        
        ListNode aPtr= headA;
        ListNode bPtr= headB;
        while(aPtr!=bPtr)
        {
            if(aPtr==null)
                aPtr=headB;
            else
                aPtr=aPtr.next;
            
            if(bPtr==null)
                bPtr=headA;
            else
                bPtr=bPtr.next;
        }
        return aPtr;
    }
}