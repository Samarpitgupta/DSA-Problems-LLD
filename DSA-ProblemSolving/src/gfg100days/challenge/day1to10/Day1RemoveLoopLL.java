package gfg100days.challenge.day1to10;

import java.util.HashSet;
import java.util.Set;

public class Day1RemoveLoopLL {

	public static void removeLoop(Node head) {
		// code here
		// remove the loop without losing any nodes
		Node prev = null;
		Node curr = head;

		Set<Node> nodeSet = new HashSet<>();

		while (curr != null) {
			if (nodeSet.contains(curr)) {
				prev.next = null;
				return;
			}
			nodeSet.add(curr);
			prev = curr;
			curr = curr.next;

		}
	}

}

class Node {
	int data;
	Node next;
}