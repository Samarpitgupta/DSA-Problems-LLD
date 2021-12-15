package leetcode.ds1;

public class ReverseLL {

	public static void main(String args[]) {
		int arr[]= {1,2,3};
		int i = 1;
		System.out.println(arr[i--]);
		System.out.println(i);
	}

	public static ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode listToDo = head.next;
		ListNode reversedList = head;

		reversedList.next = null;

		while (listToDo != null) {
			ListNode temp = listToDo;
			listToDo = listToDo.next;

			temp.next = reversedList;
			reversedList = temp;
		}

		return reversedList;
	}
}
