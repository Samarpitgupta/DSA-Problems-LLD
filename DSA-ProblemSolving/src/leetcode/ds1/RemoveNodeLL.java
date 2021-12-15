package leetcode.ds1;

public class RemoveNodeLL {

	public ListNode removeElements(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode cur = head;
		ListNode dummy = new ListNode();
		ListNode prev = dummy;
		prev.next = head;
		while (cur != null) {
			if (cur.val == val) {
				prev.next = cur.next;
				cur = cur.next;
			} else {
				cur = cur.next;
				prev = prev.next;
			}
		}
		return dummy.next;

	}

}
