package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class Qobj {
	int hd;
	Node node;

	Qobj(int hd, Node node) {
		this.hd = hd;
		this.node = node;
	}
}

public class VerticalTraversalBt {

	public static void main(String[] args) {
		// https://www.geeksforgeeks.org/print-a-binary-tree-in-vertical-order-set-3-using-level-order-traversal/
	}

	// Function to find the vertical order traversal of Binary Tree.
	static ArrayList<Integer> verticalOrder(Node root) {
		// Base case
		if (root == null)
			return new ArrayList<>();

		TreeMap<Integer, ArrayList<Integer>> m = new TreeMap<>();
		int hd = 0;
		Queue<Qobj> que = new LinkedList<Qobj>();
		que.add(new Qobj(0, root));

		while (!que.isEmpty()) {
			// pop from queue front
			Qobj temp = que.poll();
			hd = temp.hd;
			Node node = temp.node;

			// insert this node's data in array of hash
			if (m.containsKey(hd)) {
				m.get(hd).add(node.key);
			} else {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(node.key);
				m.put(hd, al);
			}
			if (node.left != null)
				que.add(new Qobj(hd - 1, node.left));
			if (node.right != null)
				que.add(new Qobj(hd + 1, node.right));
		}
		ArrayList<Integer> finalList = new ArrayList<>();
		for (Map.Entry<Integer, ArrayList<Integer>> entry : m.entrySet()) {
			ArrayList<Integer> al = entry.getValue();
			for (Integer i : al)
				finalList.add(i);
		}
		return finalList;
	}
}
