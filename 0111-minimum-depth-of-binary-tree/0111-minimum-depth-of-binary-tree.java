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
    public int minDepth(TreeNode root) {
        if(root==null)
            return  0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int minDepth = 0;
        while(!queue.isEmpty())
        {
            minDepth++;
            int queueSize = queue.size();
            for(int i=0;i<queueSize;i++)
            {
                TreeNode currentNode = queue.poll();
                // for leaf node    
                if(currentNode.left==null && currentNode.right==null)
                    return minDepth;
                if(currentNode.left!=null)
                    queue.add(currentNode.left);
                if(currentNode.right!=null)
                    queue.add(currentNode.right); 
            }    
        }
        return minDepth;
    }
}