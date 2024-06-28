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
    
    public int maxDepth(TreeNode root){
        if(root != null){
            if(root.right == null && root.left == null){
                return 1;
            }
            else if(root.right != null && root.left == null){
                return maxDepth(root.right) + 1;
            }
            else if(root.right == null && root.left != null){
                return maxDepth(root.left) + 1;
            }
            else{
                int depthLeft = maxDepth(root.left) + 1;
                int depthRight = maxDepth(root.right) + 1;

                if(depthLeft >= depthRight){
                    return depthLeft;
                }
                else{
                    return depthRight;
                }
            }
        }
        else{
            return 0;
        }
    }
}