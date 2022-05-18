package linkedlist;

class Main {
	public static void main(String args[]) {
		Node head = new Node(5);
		Node node2 = new Node(10);
		Node node3 = new Node(20);
		head.next = node2;
		node2.next = node3;
		head.next = new Node(50);
		head.next.next = new Node(310);
		head.next.next.next = new Node(140);
		traverseLL(head);
//		recTraveseLL(head);
//		System.out.println("Position : " + searchLL(head, 1));
//		System.out.println("Position : " + recSearchLL(head, 10));
//		Arrays.asList("a","b");
//		ArrayList<String> a=new ArrayList<String>() {"",""};
//		Collections.sort(Arrays.toString("")));
//		System.out.println("apple".compareTo("banana"));
	}

	// Function to insert a node at the beginning of the linked list.
	Node insertAtBeginning(Node head, int x) {
		// code here
		if (head == null) {
			return new Node(x);
		}
		Node node = new Node(x);
		node.next = head;
		return node;
	}

	// Function to insert a node at the end of the linked list.
	Node insertAtEnd(Node head, int x) {
		// code here
		if (head == null) {
			return new Node(x);
		}
		Node ptr = head;
		while (ptr != null && ptr.next != null) {
			ptr = ptr.next;
		}
		Node node = new Node(x);
		ptr.next = node;
		return head;
	}
	
	// Function to insert at a specific position
	
	
	

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
	public static int searchLL(Node head, int val) { // O(n)
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

	// Finding middle element in a linked list
	int getMiddle(Node head) {
		// Your code here.
		if (head == null)
			return -1;
		Node fastPtr = head;
		Node slowPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}
		return slowPtr.value;
	}

	// Function to count nodes of a linked list.
	public static int getCount(Node head) {

		// Code here
		int sum = 0;
		Node node = head;
		if (head == null)
			return 0;
		while (node != null) {
			sum = sum + 1;
			node = node.next;
		}
		return sum;
	}

	public static int sumOfElements(Node head) {
		// your code here
		int sum = 0;
		Node node = head;
		if (head == null)
			return 0;
		while (node != null) {
			sum = sum + node.value;
			node = node.next;
		}
		return sum;
	}

//	public N
	// Write a function to delete a node in a singly-linked list. You will not be
	// given access to the head of the list, instead you will be given access to the
	// node to be deleted directly.
	public void deleteNode(Node node) {
		Node temp = node.next; // find next node of node to be delete
		node.value = temp.value; // copy value of next node to delete node
		node.next = temp.next; // next of delete node points it to next node of next node
//		System.gc();
		temp = null;
	}

	// Delete the Middle Node of a Linked List
	public Node deleteMiddle(Node head) {
		if (head.next == null)
			return (head = null);

		// prev points to the node before slow pointer
		Node fast = head, slow = head, prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow; // previous ptr
			slow = slow.next;
		}

		// remove middle(slow) node
		prev.next = prev.next.next; // or prev.next=slow.next;

		return head;
	}

	Node reverseList(Node head) {
		// code here
		Node prev = null;
		Node curr = head;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	public Node removeNthFromEnd(Node head, int n) {

		Node start = new Node(0);
		start.next = head;
		Node slow = start, fast = start;

		// Move fast in front so that the gap between slow and fast becomes n
		for (int i = 1; i <= n + 1; i++) {
			fast = fast.next;
		}
		// Move fast to the end, maintaining the gap
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		// Skip the desired node
		slow.next = slow.next.next;
		return start.next;
	}

	int getNthFromLast(Node head, int n) {
		// Your code here

		if (head.next == null)
			return -1;
		int size = 0;
		Node curr = head;
		while (curr != null) {
			curr = curr.next;
			size++;
		}
		if (size < n)
			return -1;

		curr = head;

		for (int i = 1; i < size - n + 1; i++) {
			curr = curr.next;
		}
		return curr.value;
	}

	// Recursive
	static void printNthFromLast(Node head, int n) {
		int i = 0;

		if (head == null)
			return;
		printNthFromLast(head.next, n);

		if (++i == n)
			System.out.print(head.value);
	}

	// Merge two sorted LL
	Node sortedMerge(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		} else if (head2 == null) {
			return head1;
		}

		Node curr1 = head1;
		Node curr2 = head2;

		Node newHead = null; // new linked list head
		Node newTail = null; // new linked list tail

		// add the first node to the new merge linked list
		if (curr1.value <= curr2.value) {
			newHead = new Node(curr1.value);
			newTail = newHead;
			curr1 = curr1.next;
		} else {
			newHead = new Node(curr2.value);
			newTail = newHead;
			curr2 = curr2.next;
		}

		// Process the common length
		while (curr1 != null && curr2 != null) {
			if (curr1.value <= curr2.value) {
				newTail.next = new Node(curr1.value);
				curr1 = curr1.next;
			} else {
				newTail.next = new Node(curr2.value);
				curr2 = curr2.next;
			}
			newTail = newTail.next;
		}
		// process the remaining length
		while (curr1 != null) {
			newTail.next = new Node(curr1.value);
			curr1 = curr1.next;
			newTail = newTail.next;
		}

		while (curr2 != null) {
			newTail.next = new Node(curr2.value);
			curr2 = curr2.next;
			newTail = newTail.next;
		}
		return newHead;
	}

}