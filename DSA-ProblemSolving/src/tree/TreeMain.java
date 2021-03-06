package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeMain {

	public static void main(String args[]) {

		Node root = new Node(10);
		root.left = new Node(11);
		root.right = new Node(12);
		root.left.left = new Node(14);
		root.left.right = new Node(19);
		root.left.right.left = new Node(16);
		root.left.right.left.right = new Node(17);
		System.out.println("Tree Size : " + getTreeSize(root));
		System.out.println("Height of a Tree : " + height(root));
		System.out.println("Max : " + getMax(root));
//		inorder(root);
//		preorder(root);
//		postorder(root);
//		height(root);
//		printKDis(root, 1);
//		printLevelOrderTraversal(root);
	}

	public static void inorder(Node root) { // O(n) // auxiliary O(h)
		if (root != null) {
			inorder(root.left);
			System.out.print(root.key + " ");
			inorder(root.right);
		}
	}

	public static void preorder(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preorder(root.left);
			preorder(root.right);
		}
	}

	public static void postorder(Node root) {
		if (root != null) {
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.key + " ");
		}
	}

	public static int height(Node root) {
		if (root == null)
			return 0;
		else
			return Math.max(height(root.left), height(root.right)) + 1;
	}

	// print node at distance k
	public static void printKDis(Node root, int k) { // O(n) // aux O(h) // best case theta(1)
		if (root == null)
			return;
		if (k == 0)
			System.out.println(root.key + " ");
		else {
			printKDis(root.left, k - 1);
			printKDis(root.right, k - 1);
		}
	}

	// level order traversal
	// recursion - not good approach - X
	// sol1- find the height of tree then traverse it level wise // O (n + h*n)
	// sol2 - using queue -
	public static void printLevelOrderTraversal(Node root) {
		if (root == null)
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while (q.isEmpty() == false) {
			Node curr = q.poll();
			if (curr.left != null)
				q.add(curr.left);
			if (curr.right != null)
				q.add(curr.right);
		}
	}

	public static int getTreeSize(Node root) {
		if (root == null)
			return 0;
		else
			return 1 + getTreeSize(root.left) + getTreeSize(root.right);
	}

	// Biggest Element in the Tree
	// find max element btw left and right
	// then compare the biggest element with the key
	// element
	public static int getMax(Node root) {
		if (root == null)
			return Integer.MIN_VALUE;
		else
			return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
	}

	public static void iterativeInorderTraversal(Node root) { // aux O(h)
		Stack<Node> stack = new Stack<Node>();
		Node curr = root;
		while (curr != null || stack.isEmpty() == false) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			System.out.println(curr.key + " ");
			curr = curr.right;
		}
	}

	public Node invertTree(Node root) {

		if (root == null)
			return null;

		invertTree(root.left);
		invertTree(root.right);

		Node temp = root.left;
		root.left = root.right;
		root.right = temp;

		return root;
	}

	public boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;
		else if (root.left == null && root.right == null && targetSum - root.val == 0) {
			return true;
		} else
			return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
	}

}
