package tree;

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

class Solution {
	public boolean isSymmetric(TreeNode root) {
		return isSymmetric(root.left, root.right);
	}

	public boolean isSymmetric(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if (p == null || q == null)
			return false;
		return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
	}

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		traversePreOrder(root, ans, 0);
		return ans;
	}

	public static void traversePreOrder(TreeNode root, List<List<Integer>> ans, int level) {
		if (root == null) {
			return;
		}

		if (ans.size() <= level) {
			List<Integer> tmp = new ArrayList<Integer>();
			tmp.add(root.val);
			ans.add(tmp);
		} else {
			ans.get(level).add(root.val);
		}

		traversePreOrder(root.left, ans, level + 1);
		traversePreOrder(root.right, ans, level + 1);

	}
}
