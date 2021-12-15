package leetcode.ds1;

public class MergeTwoSortedLL {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		}

		ListNode current1 = list1;
		ListNode current2 = list2;
		ListNode newHead = null;
		ListNode newTail = null;

		if (current1.val <= current2.val) {
			newHead = new ListNode(current1.val);
			newTail = newHead;
			current1 = current1.next;
		} else {
			newHead = new ListNode(current2.val);
			newTail = newHead;
			current2 = current2.next;
		}

		while (current1 != null && current2 != null) {
			if (current1.val <= current2.val) {
				newTail.next = new ListNode(current1.val);
				current1 = current1.next;
			} else {
				newTail.next = new ListNode(current2.val);
				current2 = current2.next;
			}
			newTail = newTail.next;
		}

		while (current1 != null) {
			newTail.next = new ListNode(current1.val);
			current1 = current1.next;
			newTail = newTail.next;
		}

		while (current2 != null) {
			newTail.next = new ListNode(current2.val);
			current2 = current2.next;
			newTail = newTail.next;
		}

		return newHead;

	}
}

