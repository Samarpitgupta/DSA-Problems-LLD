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

    // We'll maintain a min-heap of size k to keep track of the current minimum element among the heads of the k lists. At each step, we'll extract the minimum node from the heap and append it to the result linked list. Then, we'll move the pointer of the extracted node to its next node in its respective list and add it back to the heap if it exists.

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the heads of all k lists to the min-heap
        for (ListNode node : lists) {
            if (node != null)
                minHeap.offer(node);
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        
        // Loop while the min-heap is not empty
        while (!minHeap.isEmpty()) {
            // Extract the minimum node from the heap
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;
            
            // Move the pointer of the extracted node to its next node in its list
            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }
        
        return dummy.next;
    }
}