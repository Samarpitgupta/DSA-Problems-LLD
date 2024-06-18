/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 import java.util.*;
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> remainingSums = new Stack<>();

        stack.push(root);
        remainingSums.push(sum);
        
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int remainingSum = remainingSums.pop();
            if (node.left == null && node.right == null && remainingSum == node.val) {
            // Path found!
            return true;
            }
            if (node.right != null) {
            stack.push(node.right);
            remainingSums.push(remainingSum - node.val);
            }
            if (node.left != null) {
            stack.push(node.left);
            remainingSums.push(remainingSum - node.val);
            }
        }
        return false;
    }
}