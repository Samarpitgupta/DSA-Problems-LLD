package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

public class TreeTraversals {
	List<Integer> preTraversalList = new ArrayList<>();
	List<Integer> postTraversalList = new ArrayList<>();
	List<Integer> inorderTraversalList = new ArrayList<>();

	public List<Integer> preorderTraversal(TreeNode root) {

		if (root == null)
			return new ArrayList<Integer>();

		preTraversalList.add(root.val);
		preorderTraversal(root.left);
		preorderTraversal(root.right);

		return preTraversalList;
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		if (root == null)
			return new ArrayList<>();

		postorderTraversal(root.left);
		postorderTraversal(root.right);
		postTraversalList.add(root.val);

		return postTraversalList;
	}

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null)
			return new ArrayList<>();

		inorderTraversal(root.left);
		inorderTraversalList.add(root.val);
		inorderTraversal(root.right);

		return inorderTraversalList;
	}
}
