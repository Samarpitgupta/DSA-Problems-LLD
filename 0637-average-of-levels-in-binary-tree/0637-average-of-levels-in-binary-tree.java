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
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> result = new ArrayList<>();

    if (root == null) {
        return result;
    }

    // Create a queue to store tree nodes using a LinkedList for efficient enqueue and dequeue operations
    Queue<TreeNode> queue = new LinkedList<>();

    // Add the root node to the queue to start the BFS traversal
    queue.offer(root);

    while (!queue.isEmpty()) {
        // Get the size of the current level - number of nodes to be processed
        int levelSize = queue.size();
        double levelSum = 0; // Initialize sum of values at the current level

        // Process all the nodes at the current level
        for (int i = 0; i < levelSize; i++) {
        TreeNode currentNode = queue.poll(); // Remove a node from the queue

        // Add the current node's value to the level sum
        levelSum += currentNode.val;

        // Add child nodes to the queue if they exist
        if (currentNode.left != null) {
            queue.offer(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.offer(currentNode.right);
        }
        }

        // Calculate the average value for the current level by dividing the level sum by the number of nodes
        result.add(levelSum / levelSize);
    }
    return result;
    }
}