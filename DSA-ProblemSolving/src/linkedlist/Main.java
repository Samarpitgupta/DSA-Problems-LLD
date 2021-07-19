package linkedlist;

class Main {
	public static void main(String args[]) {
		Node head = new Node(5);
		Node node2 = new Node(10);
		Node node3 = new Node(20);
		head.next = node2;
		node2.next = node3;
//		head.next=new Node(20);
//		head.next.next=new Node(30);
//		head.next.next.next=new Node(40);
//		traverseLL(head);
//		recTraveseLL(head);
		System.out.println("Position : " + searchLL(head, 1));
		System.out.println("Position : " + recSearchLL(head, 10));
	}

	public static void traverseLL(Node head) { // O(n)
		Node curr = head;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
	}

	public static void recTraveseLL(Node head) { // O(n) // auxilary space n
		if (head == null) {
			return;
		}
		System.out.println(head.value);
		recTraveseLL(head.next);
	}

	// return position
	public static int searchLL(Node head, int val) {   // O(n)
		Node curr = head;
		int pos = 1;
		while (curr != null) {
			if (curr.value == val) {
				return pos;
			} else {
				pos = pos + 1;
				curr = curr.next;
			}
		}
		return -1;
	}

	public static int recSearchLL(Node head, int val) { // O(n)
		if (head == null) {
			return -1;
		}
		if (head.value == val) {
			return 1;
		} else {
			int res = searchLL(head, val);
			if (res == -1)
				return -1;
			else
				return res + 1; // +1 because ll become shorter while recursive call
		}
	}
	
//	public N

}