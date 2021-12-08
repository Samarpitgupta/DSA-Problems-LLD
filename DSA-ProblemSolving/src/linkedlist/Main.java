package linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Main {
	public static void main(String args[]) {
//		Node head = new Node(5);
//		Node node2 = new Node(10);
//		Node node3 = new Node(20);
//		main(null);
//		head.next = node2;
//		node2.next = node3;
//		head.next=new Node(20);
//		head.next.next=new Node(30);
//		head.next.next.next=new Node(40);
//		traverseLL(head);
//		recTraveseLL(head);
//		System.out.println("Position : " + searchLL(head, 1));
//		System.out.println("Position : " + recSearchLL(head, 10));
//		Arrays.asList("a","b");
//		ArrayList<String> a=new ArrayList<String>() {"",""};
//		Collections.sort(Arrays.toString("")));
		System.out.println("apple".compareTo("banana"));
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
		Node temp = node.next;
		node.value = temp.value;
		node.next = temp.next;
		System.gc();
	}
	
//	public static
}